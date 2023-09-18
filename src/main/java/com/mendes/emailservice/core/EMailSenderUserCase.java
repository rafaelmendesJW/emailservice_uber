package com.mendes.emailservice.core;

public interface EMailSenderUserCase {

    void sendEmail(String to, String subject, String body);
    
}
