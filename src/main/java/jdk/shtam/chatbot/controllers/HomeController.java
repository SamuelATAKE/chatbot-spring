/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk.shtam.chatbot.controllers;

import jdk.shtam.chatbot.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Samuel
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    private final HomeService service;

    @Autowired
    public HomeController(HomeService service) {
        this.service = service;
    }
    
    @GetMapping
    public String welcome() {
        return this.service.sendWelcomeMessage();
    }
    
    @GetMapping("/{content}")
    public String message(@PathVariable String content) {
        return this.service.sendMessage(content);
    }
    
    @GetMapping("/{content}/{telephone}")
    public String messageTo(@PathVariable String content, @PathVariable String telephone) {
        return this.service.sendMessageTo(content, telephone);
    }
    
}
