/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk.shtam.chatbot.repositories;

import jdk.shtam.chatbot.entities.ChatUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Samuel
 */
public interface ChatUserRepository extends JpaRepository<ChatUser, Long> {
    
}
