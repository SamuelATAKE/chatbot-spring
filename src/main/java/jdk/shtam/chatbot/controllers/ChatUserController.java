/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk.shtam.chatbot.controllers;

import java.util.List;
import jdk.shtam.chatbot.entities.ChatUser;
import jdk.shtam.chatbot.services.ChatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Samuel
 */
@RestController
@RequestMapping("/chat-user")
public class ChatUserController {
    private final ChatUserService service;

    @Autowired
    public ChatUserController(ChatUserService service) {
        this.service = service;
    }
    
    @PostMapping
    public ChatUser addChatUser(ChatUser user) {
        return this.service.addUser(user);
    }
    
    @GetMapping
    public List<ChatUser> getUsers() {
        return this.service.getUsers();
    }
    
}
