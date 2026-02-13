package ex_30_Collection_Framework.CF_04_MAP;

import java.util.LinkedHashMap;
import java.util.*;

public class Lab247_P4_LL {
    public static void main(String[] args) {
        Map<String, String> countries = new LinkedHashMap<>();

        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("JP", "Japan");

        System.out.println(countries);
    }
}
