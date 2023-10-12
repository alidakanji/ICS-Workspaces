package DayFive;

import java.util.Scanner;

public class CastingWithInterestConversion {
    public static void main(String[] args){
        System.out.println("What is your initial amount?");
        Scanner input = new Scanner(System.in);
        double principle = input.nextDouble();
        double finalAmount = principle*(1+(0.15/1));
        System.out.print("Your amount after 1 year is $"+(int)finalAmount);
    }
}
