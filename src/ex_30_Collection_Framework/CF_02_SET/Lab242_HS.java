package ex_30_Collection_Framework.CF_02_SET;

import java.util.*;

public class Lab242_HS {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set elements: " + set);


        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
