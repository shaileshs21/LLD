package com.cart.order;

import com.actors.Buyer;
import com.constants.OrderStatus;
import com.constants.PaymentStatus;
import com.constants.PaymentType;
import com.notification.NotificationService;

import java.util.Date;
import java.util.List;

public class Order {
    int orderId;
    List<Item> orderItem;
    double orderValue;
    Buyer buyer;
    Date orderDate;
    NotificationService notificationService;

    List<OrderLog> orderLogs;

    public OrderStatus placeOrder(){
        return null;
    }

    public OrderStatus trackOrder(){
        return null;
    }

    public void addOrderLogs(){
    }

    public PaymentStatus makePayment(PaymentType paymentType){
        return null;
    }
}
