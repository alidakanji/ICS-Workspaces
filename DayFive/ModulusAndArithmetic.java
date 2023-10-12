package DayFive;

import java.util.Scanner;

public class ModulusAndArithmetic {
    public static void main(String[] args){
        System.out.println("What is your first number?");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("What is your sceond number?");
        Scanner x = new Scanner(System.in);
        int num2 = x.nextInt();
        int result=(num1+5)*3%num2/2;
        System.out.print("Your result is "+result);
    }
}
