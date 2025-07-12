package com.caspercodes.store.registration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements  NotificationService {

    @Value("${mail.server.port}")
    private String port;

    @Value("${mail.server.host}")
    private String server;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending email to " + recipientEmail);
        System.out.println("Server: " + server + ", Port: " + port);
        System.out.println("Message: " + message);
    }
}
