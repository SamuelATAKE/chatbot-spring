/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk.shtam.chatbot.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

/**
 *
 * @author Samuel
 */
public class HomeService {
    private final String ACCOUNT_SID = "AC3e4fb0da0e50f64748d3b57722ae436b";
    private final String AUTH_TOKEN = "98a517dcc53cdc6e57acb965aca1e324";

    public HomeService() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }
    
    public String sendWelcomeMessage(){
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("whatsapp:+22896791875"), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),  
                "Bienvenue sur le message")      
            .create(); 
 
        System.out.println(message.getSid()); 
        return message.getSid();
    }
    
    public String sendMessage(String content){
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("whatsapp:+22896791875"), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),  
                content)      
            .create(); 
 
        System.out.println(message.getSid()); 
        return message.getSid();
    }
    
    public String sendMessageTo(String content, String to){
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("whatsapp:+228"+to), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),  
                content)      
            .create(); 
 
        System.out.println(message.getSid()); 
        return message.getSid();
    }
    
    
}
