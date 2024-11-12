# PizzeriaJava
- A series of Java classes and interfaces that simulates how a pizzeria works.

## Description/Features
- the customers will be able to order (one or more) pizzas, and customizing it with the preferred toppings (if available);
- the pizzeria will add each order to a queue of orders;
- the pizzeria will serve each pizza in the same order of the queue, to the respective customer;
- once the pizza is served, the pizzeria will calculate the final price as the sum of all pizzas being ordered by that customer;

- the pizzeria implements different strategies to maximize profit;

### Simple Examples
- If a customer, let's say Mike, has ordered a pizza with **no topping**:
```
Mike has ordered a normal pizza
```

- if Mike has opted for **some toppings**, say onions and sausages:
```
Mike has ordered a pizza with onions and sausages
```

- if Mike has opted for the **same topping more than once**, say onions:
```
Mike has ordered a pizza with a lot of onions
```

- if Mike has opted for **several toppings, some more than once**:
```
Mike has ordered a pizza with a lot of onions, tomatoes and sausages
```

- when calculating how much Mike will have to pay:
```
Mike has ordered a normal pizza, that costs XXXX.XX
Mike has ordered a pizza with onions and sausages, that costs XXXX.XX
Mike has ordered a pizza with a lot of onions, tomatoes and sausages, that costs XXXX.XX
Mike has to pay: XXXX.XX
```

### Complete example
- If two customers, Mike and Paul, have ordered various pizzas:
```
Mike has ordered a normal pizza, that costs XXXX.XX
Mike has ordered a pizza with onions and sausages, that costs XXXX.XX
Mike has ordered a pizza with a lot of onions, tomatoes and sausages, that costs XXXX.XX
Mike has to pay: XXXXXX.XX

Paul has ordered a pizza with a lot of potatoes and sausages, that costs YYYY.YY
Paul has ordered a pizza with a lot of potatoes and sausages, that costs YYYY.YY
Paul has to pay: YYYYYY.YY

Pizzeria total revenue: ZZZZZZ.ZZ
```

## Extra details
- assume the pizzeria has few customers (two or three);
- assume each customer orders at least one pizza (ideally two);
- assume each pizza can have at most four different toppings;
- use TDD (Test Driven Development);
- (try to) use some of the follollwing patterns where most fitting: Adapter, Chain of Responsability, Composite, Decorator, Singleton, Strategy.

## Future ideas/features
- the pizzeria may run out of certain toppings;
- customers may prefer some toppings over others;
- customers may also get beverages;
- pizzas may require different preparation times;
- the pizzeria may be able to prepare few pizzas concurrently;
- pizzas may have many toppings;

## NOTES
- This project is under the MIT license;
- This project is intended for learning/educational porpuses, specifically, in regards of the Java Programming Language and various Programming Patterns and Design. As so, it does not claim to be the most correct or efficient solution;
- This project was developed using Java 17.0.11 and Gradle 8.11;