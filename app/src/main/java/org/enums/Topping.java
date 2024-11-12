package org.enums;

public enum Topping {
    NONE(0),
    CHEESE(120), //example: cheese price is 120 cents 
    TOMATOES(140),
    SAUSAGES(130),
    POTATOES(120),
    PEPPERS(125),
    ONIONS(130),
    SARDINAS(150),
    CHIPS(120),
    MUSHROOMS(130);

    private final int baseToppingPrice;

    Topping(int price) {
        this.baseToppingPrice = price;
    }

    public int getBaseToppingPrice() {
        return baseToppingPrice;
    }
}
