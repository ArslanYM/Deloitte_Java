package com.ecommerce.app;

public interface MyProduct {
    String name = "";
    double price = 0;
    int quantity = 0;

    public abstract double calculatePrice();
}
