package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab251_HashTable {
    public static void main(String[] args) {
        // Map - K, V,  null values allows
        // Hashtable K,V - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(4, null);
//        ht1.put(null, "three");

        Map<Integer,String> ht2 = new HashMap<>();
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(4, null);
        ht2.put(null, "three");
    }
}
