package org.classes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private final Customer customer;
    private final String[] toppings;

    public Order(Customer cust, String[] topps) {
        this.customer = cust;
        this.toppings = topps;
    }

    private String formatToppings() {
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (String str : toppings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String key = entry.getKey();
            int count = entry.getValue();    
            if (count > 1) {
                resultList.add("a lot of " + key.toLowerCase());
            } else if (key.equals("NONE")) {
                resultList.add("normal pizza");
            }
            else {
                resultList.add(key.toLowerCase());
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

    public String[] getToppings() {
        return this.toppings;
    }

    @Override
    public String toString() {
        return customer.getName() + " has ordered a " + formatToppings();
    }
}
