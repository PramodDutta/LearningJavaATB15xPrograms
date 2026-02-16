package ex_30_Collection_Framework.CF_05_Comparable_Vs_Comparator;

import java.util.*;

public class LabComparator {

    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(3, "John", 100));
        list.add(new Employee2(1, "Alice", 134));
        list.add(new Employee2(2, "Bob", 234));

        Comparator<Employee2> idComparator = (e1, e2) -> e1.id - e2.id;
        Comparator<Employee2> salaryComparator = (e1, e2) -> e1.salary - e2.salary;
        Comparator<Employee2> nameComparator = (e1, e2) -> e1.name.compareTo(e2.name);


        Collections.sort(list, salaryComparator);
        System.out.println(list);


    }

}

class Employee2 {
    Integer id;
    String name;
    Integer salary;

    public Employee2(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}