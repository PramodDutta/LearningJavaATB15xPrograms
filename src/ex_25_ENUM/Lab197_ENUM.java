package ex_25_ENUM;

public class Lab197_ENUM {

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal()); // (zero-indexed position)
    }


}
