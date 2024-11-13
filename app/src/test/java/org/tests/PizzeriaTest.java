package org.tests;

import org.classes.Customer;
import org.classes.Pizzeria;
import org.enums.Topping;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PizzeriaTest {
    Pizzeria pizzeria = Pizzeria.getInstance();
    Customer mike = new Customer("Mike");
    Customer paul = new Customer("Paul");

    @Test
    void testThatPizzaIsInRightFormat() {}

    @Test
    void testThatCustomerOrdersAreInRightFormat() {
        String[] pizzaOfMikeToppings1 = {Topping.ONIONS.name(), Topping.ONIONS.name(), Topping.TOMATOES.name()};
        pizzeria.takeOrder(mike, pizzaOfMikeToppings1);
        String[] pizzaOfMikeToppings2 = {Topping.SAUSAGES.name(), Topping.TOMATOES.name()};
        pizzeria.takeOrder(mike, pizzaOfMikeToppings2);
        String[] pizzaOfPaulToppings1 = {Topping.NONE.name()};
        pizzeria.takeOrder(paul, pizzaOfPaulToppings1);
        String[] pizzaOfPaulToppings2 = {Topping.SARDINAS.name()};
        pizzeria.takeOrder(paul, pizzaOfPaulToppings2);
        String[] pizzaOfPaulToppings3 = {Topping.SAUSAGES.name(), Topping.CHEESE.name(), Topping.CHEESE.name()};
        pizzeria.takeOrder(paul, pizzaOfPaulToppings3);
        String[] pizzaOfMikeToppings4 = {Topping.MUSHROOMS.name(), Topping.MUSHROOMS.name(), Topping.CHEESE.name(), Topping.CHEESE.name()};
        pizzeria.takeOrder(mike, pizzaOfMikeToppings4);
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Mike has ordered a pizza with a lot of onions and tomatoes\n");
        expectedOutput.append("Mike has ordered a pizza with sausages and tomatoes\n");
        expectedOutput.append("Paul has ordered a normal pizza\n");
        expectedOutput.append("Paul has ordered a pizza with sardinas\n");
        expectedOutput.append("Paul has ordered a pizza with sausages and a lot of cheese\n");
        expectedOutput.append("Mike has ordered a pizza with a lot of mushrooms and a lot of cheese\n");
        assertEquals(expectedOutput.toString(), pizzeria.getOrders());

    }

    @Test
    void testThatOrdersAreIssuedCorrectly() {
        testThatCustomerOrdersAreInRightFormat();
        pizzeria.serveOrders();
        assertEquals(0, pizzeria.remainingOrders());
    }

    /*
    @Test
    void testThatOrdersAreReceivedCorrectly() {
        testThatCustomerOrdersAreInRightFormat();
        pizzeria.serveOrders();
        assertEquals(0, pizzeria.remainingOrders());
    }
     */

    @Test
    void testThatTotalPricesAreCorrect() {
        testThatOrdersAreIssuedCorrectly();
        int basePizzaPrice = 400;
        int sumToppingsPizza1 = basePizzaPrice + Topping.ONIONS.getBaseToppingPrice() * 2 + Topping.TOMATOES.getBaseToppingPrice();
        int sumToppingsPizza2 = basePizzaPrice + Topping.SAUSAGES.getBaseToppingPrice() + Topping.TOMATOES.getBaseToppingPrice();
        int sumToppingsPizza3 = basePizzaPrice;
        int sumToppingsPizza4 = basePizzaPrice + Topping.SARDINAS.getBaseToppingPrice();
        int sumToppingsPizza5 = basePizzaPrice + Topping.SAUSAGES.getBaseToppingPrice() + Topping.CHEESE.getBaseToppingPrice() * 2;
        int sumToppingsPizza6 = basePizzaPrice + Topping.MUSHROOMS.getBaseToppingPrice() * 2 * Topping.CHEESE.getBaseToppingPrice() * 2;
        int expectedTotalRevenue = sumToppingsPizza1 + sumToppingsPizza2 + sumToppingsPizza3 + sumToppingsPizza4 + sumToppingsPizza5 + sumToppingsPizza6;
        assertEquals(expectedTotalRevenue, pizzeria.calculateTotalRevenue());
    }

    @Test
    void testThatStrategy1() {}

    @Test
    void testThatStrategy2() {}
    
}
