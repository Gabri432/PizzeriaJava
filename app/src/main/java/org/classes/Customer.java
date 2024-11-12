package org.classes;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.interfaces.Pizza;

public class Customer {
    private final String name;
    private final List<Pizza> myOrders;
    
    public Customer(@Nonnull String name) {
        this.name = name;
        this.myOrders = new ArrayList<>();
    }

    public void getOrder() {}

    public String getName() {
        return name;
    }
}
