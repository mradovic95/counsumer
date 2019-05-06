package com.vezbe.consumer.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vezbe.consumer.dto.MessageDto;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.validation.Validator;

@Component
public class MessageListener extends AbstractListener {

    public MessageListener(Validator validator, ObjectMapper mapper) {
        super(validator, mapper);
    }

    @JmsListener(destination = "${destination.message}", concurrency = "5-10")
    public void addMessage(Message message) throws JMSException {
        MessageDto messageDto = getMessage(message, MessageDto.class);
        System.out.println(messageDto);
    }

}
