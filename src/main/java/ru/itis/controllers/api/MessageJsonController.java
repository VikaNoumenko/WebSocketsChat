package ru.itis.controllers.api;/* 30.05.2017
MessageJsonController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.model.Message;
import ru.itis.service.MessageService;

public class MessageJsonController {
    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/annotation/message/json", method =  RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Message find(){
        Message messages = messageService.find(3);
        return messages;
    }
}
