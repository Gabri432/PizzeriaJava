package org.tests;

import org.classes.Customer;
import org.classes.Pizzeria;
import org.enums.Topping;
import org.junit.jupiter.api.Test;

public class PizzeriaTest {
    Pizzeria pizzeria = Pizzeria.getInstance();
    Customer mike = new Customer("Mike");
    Customer paul = new Customer("Paul");

    @Test
    void testThatPizzaIsInRightFormat() {}

    @Test
    void testThatCustomerOrdersAreInRightFormat() {
        /*String[] pizzaOfMikeToppings1 = {Topping.ONIONS.name(), Topping.ONIONS.name(), Topping.TOMATOES.name()};
        pizzeria.takeOrder(mike, pizzaOfMikeToppings1);
        String[] pizzaOfMikeToppings2 = {Topping.SAUSAGES.name(), Topping.TOMATOES.name()};
        pizzeria.takeOrder(mike, pizzaOfMikeToppings2);
        String[] pizzaOfPaulToppings1 = {};
        pizzeria.takeOrder(paul, pizzaOfPaulToppings1);
        String[] pizzaOfPaulToppings2 = {Topping.SARDINAS.name()};
        pizzeria.takeOrder(mike, pizzaOfPaulToppings2);
        String[] pizzaOfPaulToppings3 = {Topping.SAUSAGES.name(), Topping.CHEESE.name(), Topping.CHEESE.name()};
        pizzeria.takeOrder(mike, pizzaOfPaulToppings3);*/

    }

    @Test
    void testThatOrdersAreTakenCorrectly() {}

    @Test
    void testThatOrdersAreIssuedCorrectly() {}

    @Test
    void testThatPricesAreCorrect() {}

    @Test
    void testThatStrategy1() {}

    @Test
    void testThatStrategy2() {}
    
}
