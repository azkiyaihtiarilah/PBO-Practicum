package experiment1;

import java.util.Scanner;
/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);

        System.out.print("input first number: ");
        int num1 = sc7.nextInt();

        System.out.print("input next number: ");
        int num2 = sc7.nextInt();

        System.out.print("input operator +, -, *, / : ");
        char operator = sc7.next().charAt(0);

        int calculate = 0;
        switch (operator){
            case '+':
                calculate =  num1 + num2;
                break;
            case '-':
                calculate =  num1 - num2;
                break;
            case '*':
                calculate =  num1 * num2;
                break;
            case '/':
                if (num1 ==0) {
                    System.out.println("number cannot to calculate");
                } else{
                    calculate =  num1 + num2;
                } break;
            default:
             System.out.println("invalid input");
        }
        System.out.println("result: " + calculate);

        sc7.close();
    }
}