package org.interfaces;

import org.classes.Order;

public interface Handler {
    public void setNextHandler(Handler nextHandler);

    public void handleOrder(Order order);

    public boolean isReady(Order order);

}
