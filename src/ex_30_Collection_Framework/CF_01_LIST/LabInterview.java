package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class LabInterview {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());

        for (Integer o:al){
            System.out.println(o);
        }

        Vector v = new Vector<>();
        v.add("Pramod");
        v.add("Dutta");
        v.add("Amit");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }




    }
}
