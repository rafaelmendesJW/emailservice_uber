package com.mendes.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mendes.emailservice.adapters.EmailSenderGateway;
import com.mendes.emailservice.core.EMailSenderUserCase;

@Service
public class EmailSenderService implements EMailSenderUserCase{

    private final EmailSenderGateway emailSenderGateway;


    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }


    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
        
    }
    
  
  
}
