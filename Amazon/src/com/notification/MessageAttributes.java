package com.notification;

public class MessageAttributes {
    String from;
    String to;
    String message;

    public MessageAttributes() {
    }

    public MessageAttributes(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }
}
