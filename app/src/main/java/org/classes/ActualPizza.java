package org.classes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.enums.Topping;
import org.interfaces.Pizza;

public class ActualPizza implements Pizza {
    private final String[] toppings;
    private final Map<String, Integer> toppingMap = new LinkedHashMap<>();

    public ActualPizza(String[] topps) {
        this.toppings = topps;
        for (String str : toppings) {
            toppingMap.put(str, toppingMap.getOrDefault(str, 0) + 1);
        }
    }

    private String formatToppings() {
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> topping : toppingMap.entrySet()) {
            String toppingName = topping.getKey();
            int toppingQuantity = topping.getValue();    
            if (toppingQuantity > 1) {
                resultList.add("a lot of " + toppingName.toLowerCase());
            } else if (toppingName.equals("NONE")) {
                resultList.add("normal pizza");
            }
            else {
                resultList.add(toppingName.toLowerCase());
            }
        }
        String resultString = resultList.toString().replace("[", "").replace("]", "");
        if (!resultString.contains("pizza")) {
            resultString = "pizza with " + resultString;
        }
        if (resultString.contains(",")) {
            int commaIndex = resultString.lastIndexOf(",");
            String before = resultString.substring(0, commaIndex);
            String after =  resultString.substring(commaIndex + 1);
            return before + " and" + after;
        } else {
            return resultString;
        }
       
    }

    @Override
    public String getDescription() {
        return this.formatToppings();
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : toppingMap.entrySet()) {
            String topping = entry.getKey();
            int count = entry.getValue(); 
            sum += Topping.valueOf(topping).getBaseToppingPrice() * count;
        }
        //return sum;
        return 0;
    }

    @Override
    public boolean isReady() {
        return false;
    }

}