package org.classes;

import org.interfaces.Handler;

public class KitchenHandler implements Handler{

    public KitchenHandler() {}

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
