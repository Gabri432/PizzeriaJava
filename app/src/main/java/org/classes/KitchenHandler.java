package org.classes;

import java.util.ArrayList;

import org.interfaces.Handler;

public class KitchenHandler implements Handler{

    private KitchenHandler() {
    }

    private static class KitchenHandlerHelper {
        private static final KitchenHandler INSTANCE = new KitchenHandler();
    }

    public static KitchenHandler getInstance() {
        return KitchenHandlerHelper.INSTANCE;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNextHandler'");
    }

    @Override
    public void handleOrder(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleOrder'");
    }

    public boolean isReady(Order order) {
        return false;
    }
}
