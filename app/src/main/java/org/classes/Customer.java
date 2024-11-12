package org.classes;

import javax.annotation.Nonnull;

public class Customer {
    private final String name;
    
    public Customer(@Nonnull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
