package DayFive;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args){
        System.out.println("Enter the amount of money in USD");
        Scanner input = new Scanner(System.in);
        int usDollars = input.nextInt();
        double canadianDollars = usDollars*1.25;
        System.out.print("The conversion is "+canadianDollars);
}
}
