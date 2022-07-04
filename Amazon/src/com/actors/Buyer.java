package com.actors;

import com.cart.order.Order;
import com.cart.order.ProductReview;
import com.cart.order.ShoppingCart;
import com.constants.OrderStatus;

public class Buyer extends User{
    Order orderObj;

    public void addReview(ProductReview productReview){

    }

    public OrderStatus placeOrder(ShoppingCart cart){
        return null;
    }
}
