package ex_29_Generics;

public class Lab224 {

    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum("pramod","pramod");
    }


//    static void temp_sum(Integer a, Integer b) {
//        System.out.println(a);
//        System.out.println(a);
//    }
//    static void temp_sum(String a, String b) {
//        System.out.println(a);
//        System.out.println(a);
//    }


    static <pramod> pramod temp_sum(pramod a, pramod b) {
        System.out.println(a);
        System.out.println(a);
        return null;
    }

}

