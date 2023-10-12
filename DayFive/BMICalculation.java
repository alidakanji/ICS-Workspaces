package DayFive;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args){
        System.out.println("What is your weight?");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.println("What is your height (in meters)?");
        Scanner x = new Scanner(System.in);
        double height = x.nextDouble();
        double BMI=weight/(height*height);
        System.out.print("Your BMI is "+BMI);
    }
}
