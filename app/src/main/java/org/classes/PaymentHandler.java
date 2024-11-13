package org.classes;

import java.util.ArrayList;
import java.util.List;

import org.interfaces.Handler;

public class PaymentHandler implements Handler {
    private final List<Order> ordersToPay;
    private Handler nextHandler;
    
    private PaymentHandler() {
        ordersToPay = new ArrayList<>();
    }

    private static class PaymentHandlerHelper {
        private static final PaymentHandler INSTANCE = new PaymentHandler();
    }

    public static PaymentHandler getInstance() {
        return PaymentHandlerHelper.INSTANCE;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOrder(Order order) {
        if (!ordersToPay.contains(order)) {
            ordersToPay.add(order);
        }
    }

    @Override
    public boolean isReady(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isReady'");
    }

    private int calculateCost(Order order) {
        return new ActualPizza(order.getToppings()).getPrice();
    }

    public int costPerCustomer(Customer cust) {
        int total = 0;
        for (Order order : ordersToPay) {
            if (order.getCustomer().getName().equals(cust.getName())) {
                total += calculateCost(order);
            }
        }
        return total;
    }

    public int totalCost() {
        int total = 0;
        for (Order order : ordersToPay) {
            total += calculateCost(order);
        }
        return total;
    }

}
