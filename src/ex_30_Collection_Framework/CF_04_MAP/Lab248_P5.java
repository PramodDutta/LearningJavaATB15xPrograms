package ex_30_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab248_P5 {
    public static void main(String[] args) {
        Map<String, Integer> prices = new TreeMap<>();

        prices.put("Banana", 40);
        prices.put("Apple", 120);
        prices.put("Cherry", 200);
        prices.put("Date", 350);
        // {Apple=120, Banana=40, Cherry=200, Date=350}
        // ✅ Sorted alphabetically by key!

        System.out.println(prices);
    }
}
