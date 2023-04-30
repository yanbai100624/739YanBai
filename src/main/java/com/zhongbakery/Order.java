package com.zhongbakery;

public class Order {

    public int totalPrice;

    public Order(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean checkout(Card card) {
        return card.isValid;
    }
}