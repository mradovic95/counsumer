package com.vezbe.consumer.controller;

import com.vezbe.consumer.dto.MessageDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/message")
public class MessageController {

    @PostMapping
    public void addMessage(@RequestBody @Valid MessageDto messageDto) {
        System.out.println(messageDto);
    }

}
