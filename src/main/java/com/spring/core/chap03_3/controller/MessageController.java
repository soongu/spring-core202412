package com.spring.core.chap03_3.controller;

import com.spring.core.chap03_3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void showMessage() {
        System.out.println(messageService.getMessage());
    }
}
