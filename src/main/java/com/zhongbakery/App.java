package com.zhongbakery;

public final class App {
    public static void main(String[] args) {

        Customer customer = createCustomer();

        Menu menu = createMenu();

        Order order = createOrder(customer, menu);

        Boolean isCheckedOut = order.checkout(customer.cards[0]);

        System.out.println("Customer is checked out: " + isCheckedOut);
    }

    public static Order createOrder(Customer customer, Menu menu) {
        Bakery[] selectedBakeries = { menu.selectBakery("b1"), menu.selectBakery("b2") };
        return customer.createOrder(selectedBakeries);
    }

    public static Customer createCustomer() {
        Card[] myCards = { new Card("Amex", true) };
        return new Customer("yan", myCards);
    }

    public static Menu createMenu() {
        Bakery b1 = new Bakery("b1", 1);
        Bakery b2 = new Bakery("b2", 1);
        Bakery[] bakeries = {b1, b2};
        return new Menu(bakeries);
    }
}
