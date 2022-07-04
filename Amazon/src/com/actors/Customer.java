package com.actors;

import com.cart.order.Item;
import com.cart.order.ShoppingCart;
import com.search.Search;

public class Customer {
    ShoppingCart cart;
    Search searchObj;
    int customerId;

    public ShoppingCart getShoppingCart(String customerId) {
        return cart;
    }

    public void addItemsToShoppingCart(Item item){

    }

    public void updateItemFromShoppingCart(Item item){

    }

    public void removeItemFromShoppingCart(Item item){

    }
}
