package ru.itis.controllers.api.rest;/* 30.05.2017
MessageRestController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.itis.model.Message;
import ru.itis.service.MessageService;

public class MessageRestController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/message/{id}")
    public Message getId(@PathVariable("id") int id) {
        return messageService.find(3);
    }
}
