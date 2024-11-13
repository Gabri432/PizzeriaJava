package org.classes;

import java.util.ArrayList;
import java.util.List;

import org.interfaces.Handler;

public class KitchenHandler implements Handler{
    private final List<Order> ordersToPrepare;
    //private final Handler nextHandler = null;

    private KitchenHandler() {
        ordersToPrepare = new ArrayList<>();
    }

    private static class KitchenHandlerHelper {
        private static final KitchenHandler INSTANCE = new KitchenHandler();
    }

    public static KitchenHandler getInstance() {
        return KitchenHandlerHelper.INSTANCE;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        throw new UnsupportedOperationException("Unimplemented method 'setNextHandler'");
    }

    @Override
    public void handleOrder(Order order) {
        if (!ordersToPrepare.contains(order)) {
            ordersToPrepare.add(order);
        }
        cook(order);
    }

    private void cook(Order order) {}

    @Override
    public boolean isReady(Order order) {
        return false;
    }
}
