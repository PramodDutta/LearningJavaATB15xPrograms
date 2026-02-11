package ex_30_Collection_Framework.CF_01_LIST;

import java.util.LinkedList;

public class Lab234 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");       // adds at end
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");  // adds at beginning
        list.addLast("Grapes"); // adds at end
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));

        list.removeFirst();
        list.remove("Banana");
        System.out.println(list);
        list.remove(2);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Cherry"));





    }
}
