package com.guisfco;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationServiceImpl implements NotificationService {

    @Override
    public void send(String message) {
        IO.println("Sending SMS: " + message);
    }
}
