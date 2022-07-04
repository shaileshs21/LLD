package com.booking;

import com.constants.PaymentStatus;

import java.time.LocalDate;
import java.util.Date;

public class Payment {
    long amount;
    String transactionId;
    PaymentStatus paymentStatus;
    Date createdOn;

    public Payment(long amount, String transactionId, PaymentStatus paymentStatus) {
        this.amount = amount;
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
        this.createdOn = new Date();
    }
}
