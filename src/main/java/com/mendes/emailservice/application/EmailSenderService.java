package com.mendes.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;

import com.mendes.emailservice.adapters.EmailSenderGateway;
import com.mendes.emailservice.core.EMailSenderUserCase;

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
