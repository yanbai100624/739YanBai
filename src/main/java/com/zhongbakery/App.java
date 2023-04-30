package com.zhongbakery;

public final class App {
    public static void main(String[] args) {

        Customer customer = createCustomer();

        Menu menu = createMenu();

        Order order = createOrder(customer, menu);

        Boolean isCheckedOut = order.checkout(customer.cards[0]);

        if (isCheckedOut) {
            System.out.println("Payment successful with card name: " + customer.cards[0].name);
            System.out.println("=======================================\n");
        }
    }

    public static Order createOrder(Customer customer, Menu menu) {

        System.out.println("\n=======================================");
        System.out.println("New Order from customer: " + customer.name);

        Bakery[] selectedBakeries = { menu.selectBakery("b1"), menu.selectBakery("b2") };
        for (Bakery bakery : selectedBakeries) {
            System.out.println("Bakery name: " + bakery.name + "     " + "Price: $" + bakery.price);
        }

        Order order = customer.createOrder(selectedBakeries);
        System.out.println("Total Price: " + "              $" + order.totalPrice);

        return order;
    }

    public static Customer createCustomer() {
        Card[] myCards = { new Card("Amex", true) };
        return new Customer("Yan Bai", myCards);
    }

    public static Menu createMenu() {
        Bakery b1 = new Bakery("b1", 1);
        Bakery b2 = new Bakery("b2", 1);
        Bakery[] bakeries = {b1, b2};
        return new Menu(bakeries);
    }
}
