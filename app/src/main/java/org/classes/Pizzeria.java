package org.classes;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private final List<Order> orders;
    private final List<Customer> customers;

    private Pizzeria() {
        orders = new ArrayList<>();
        customers = new ArrayList<>();
    }

    private static class PizzeriaHelper {
        private static final Pizzeria INSTANCE = new Pizzeria();
    }

    public static Pizzeria getInstance() {
        return PizzeriaHelper.INSTANCE;
    }

    private class Order{}

    public void takeOrder(Customer cust, String[] toppings) {}

    public void serveOrder() {}

    @Override
    public String toString() {
        return super.toString();
    }
}
