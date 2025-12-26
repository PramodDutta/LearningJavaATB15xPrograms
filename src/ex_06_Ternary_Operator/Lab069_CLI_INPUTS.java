package ex_06_Ternary_Operator;

public class Lab069_CLI_INPUTS {
    // Ternary Operator (No if-else allowed)
    // Problem
    //
    //Write a Statment that returns:
    //  int marks = 100;
    //"PASS" if marks ≥ 40
    //
    //"FAIL" otherwise
    public static void main(String[] args) {
        int marks = 30;
        String result  = (marks >=40) ? "PASS" : "FAIL";
        System.out.println(result);
    }

}
