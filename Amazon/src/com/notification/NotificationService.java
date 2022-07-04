package com.notification;

public class NotificationService {

    public boolean sendNotification(NotificationDomain notificationDomain) {
        Notification notification;
        MessageAttributes messageAttributes;

        switch (notificationDomain.getNotificationType()) {
            case EMAIL:
                notification = new EmailNotification();
                messageAttributes = new MessageAttributes("fromXyz", notificationDomain.getUser().getAccount().getEmail(),
                        "Order detail message.....");
                break;

            case WHATSAPP:
                notification = new WhatsAppNotification();
                messageAttributes = new MessageAttributes("fromXYZ", notificationDomain.getUser().getAccount().getPhoneNumber(),
                        "Order detail message.....");
                break;

            default:
                notification = new SMSNotification();
                messageAttributes = new MessageAttributes("fromXYZ", notificationDomain.getUser().getAccount().getPhoneNumber(),
                        "Order detail message.....");
                break;


        }

        return notification.sendNotification(messageAttributes);
    }
}
