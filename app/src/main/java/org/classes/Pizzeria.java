package org.classes;

import java.util.ArrayList;
import java.util.List;

import org.interfaces.Handler;

public class Pizzeria{
    private final List<Order> orders;
    private final Handler nextHandler;

    private Pizzeria() {
        orders = new ArrayList<>();
        nextHandler = KitchenHandler.getInstance();
    }

    private static class PizzeriaHelper {
        private static final Pizzeria INSTANCE = new Pizzeria();
    }

    public static Pizzeria getInstance() {
        return PizzeriaHelper.INSTANCE;
    }

    public void takeOrder(Customer cust, String[] toppings) {
        orders.add(new Order(cust, toppings));
    }

    public void serveOrders() {
        for (Order order : orders) {
            nextHandler.handleOrder(order);
        }
    }

    public int remainingOrders() {
        return orders.size();
    }

    public String getOrders() {
        StringBuilder s = new StringBuilder();
        for (Order order : orders) {
            s.append(order).append("\n");
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
