package com.caspercodes.store.registration;

@FunctionalInterface
public interface NotificationService {
    void send(String message, String recipientEmail);
}