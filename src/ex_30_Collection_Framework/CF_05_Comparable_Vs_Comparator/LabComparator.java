package ex_30_Collection_Framework.CF_05_Comparable_Vs_Comparator;

import java.util.*;

public class LabComparator {

    public static void main(String[] args) {
        List<Employee> markslist = new ArrayList<>();
        markslist.add(new Employee(3, "Pramod", 100));
        markslist.add(new Employee(1, "Alice", 134));
        markslist.add(new Employee(2, "Bob", 234));

//        List<Integer> marks = new ArrayList<>();
//        marks.add(100);
//        marks.add(90);
//        marks.add(92);
//        Collections.sort(marks);
//        System.out.println(marks);

        System.out.println(markslist);
        System.out.println(" ----- ");
        Comparator<Employee> idComparator = (e1, e2) -> e1.id - e2.id;
        Collections.sort(markslist,idComparator);
        System.out.println(markslist);

    }


}

class Employee {
    Integer id;

    public Employee(Integer id, String name, Integer salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    String name;
    Integer salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
