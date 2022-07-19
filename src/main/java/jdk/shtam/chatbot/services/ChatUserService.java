/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk.shtam.chatbot.services;

import java.util.List;
import jdk.shtam.chatbot.entities.ChatUser;
import jdk.shtam.chatbot.repositories.ChatUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Samuel
 */
public class ChatUserService {
    private final ChatUserRepository repository;

    @Autowired
    public ChatUserService(ChatUserRepository repository) {
        this.repository = repository;
    }
    
    public ChatUser addUser(ChatUser user) {
        this.repository.save(user);
        return user;
    }
    
    public List<ChatUser> getUsers() {
        return this.repository.findAll();
    }
    
    
}
