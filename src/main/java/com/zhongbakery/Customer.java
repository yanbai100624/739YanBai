package com.zhongbakery;

public class Customer {
    public String name;
    public Card[] cards;

    public Customer(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public Order createOrder(Bakery[] bakeries) {
        int totalPrice = 0;
        for (Bakery bakery : bakeries) {
            totalPrice += bakery.price;
        }
        return new Order(totalPrice);
    }

    
}