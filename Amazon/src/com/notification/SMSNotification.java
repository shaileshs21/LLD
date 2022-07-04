package com.notification;

public class SMSNotification implements Notification{
    @Override
    public boolean sendNotification(MessageAttributes messageAttributes) {
        return false;
    }
}
