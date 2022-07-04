package com.notification;

public class EmailNotification implements Notification{
    @Override
    public boolean sendNotification(MessageAttributes messageAttributes) {
        return false;
    }
}
