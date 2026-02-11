package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));

        ArrayList a  = new ArrayList();
        a.add("prrammod");
        a.add("dutta");


    }
}
