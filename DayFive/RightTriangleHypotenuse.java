package DayFive;

import java.util.Scanner;

public class RightTriangleHypotenuse {
    public static void main(String[] args){
        System.out.println("What is the measurement of side 1?");
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        System.out.println("What is the measurement of side 2?");
        Scanner x = new Scanner(System.in);
        int side2 = input.nextInt();
        int hypotenuse=(side1*side1)+(side2*side2);
        System.out.print("The length of the hypotenuse is "+Math.sqrt(hypotenuse));
    }
}
