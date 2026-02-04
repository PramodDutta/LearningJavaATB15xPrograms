package ex_25_ENUM;

public class Lab200_Congrats {


    public static void main(String[] args) {

        System.out.println(ENV.QA.getBaseURL());
        // Here I can write the QA code
        if(ENV.QA.getBaseURL().equalsIgnoreCase("https://qa.myapp.com")){
            System.out.println("Start on QA!!");
        }



    }


}

