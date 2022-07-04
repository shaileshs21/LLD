package com.cart.order;

import com.actors.Seller;
import com.constants.ProductCategory;

import java.util.List;

public class Product {
    int productId;
    String productDescription;
    String name;
    ProductCategory productCategory;
    Seller seller;
    double cost;

    List<ProductReview> productReviews;
}
