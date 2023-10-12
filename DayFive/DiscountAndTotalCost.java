package DayFive;

import java.util.Scanner;

public class DiscountAndTotalCost {
    public static void main(String[] args){
        System.out.println("What was the original cost of the item?");
        Scanner input = new Scanner(System.in);
        int originalPrice = input.nextInt();
        double x=originalPrice*0.2;
        double discountedPrice=x+originalPrice;
        double finalCost=discountedPrice*1.13;
        System.out.print("The final price is "+finalCost);
    }
}
