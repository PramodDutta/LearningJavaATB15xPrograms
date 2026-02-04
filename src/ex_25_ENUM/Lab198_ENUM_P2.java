package ex_25_ENUM;

public class Lab198_ENUM_P2 {
    public static void main(String[] args) {

            Day today = Day.MONDAY;

            switch (today){
                case MONDAY -> System.out.println("Monday");
                case FRIDAY -> System.out.println("FRIDAY");
            }


        System.out.println(API_URLS.valueOf("google"));

    }
}
