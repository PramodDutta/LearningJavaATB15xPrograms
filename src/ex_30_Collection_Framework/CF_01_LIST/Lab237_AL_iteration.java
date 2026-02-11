package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        List<String> mylist2 = new ArrayList<>();


        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println(" - To Print Arraylist - 1 ");

        for(String name:mylist){
            System.out.println(name);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist2.get(i));
        }

        System.out.println(" - To Print Arraylist - 3 ");

        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
