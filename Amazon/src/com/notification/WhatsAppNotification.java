package com.notification;

public class WhatsAppNotification implements Notification{
    @Override
    public boolean sendNotification(MessageAttributes messageAttributes) {
        return false;
    }
}
