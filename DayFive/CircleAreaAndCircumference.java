package DayFive;

import java.util.Scanner;

public class CircleAreaAndCircumference {
    public static void main(String[] args){
        System.out.println("What is the radius of your circle?");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        double area=3.14*(radius*radius);
        double circumference=2*3.14*radius;
        System.out.println("The area of your circle is "+area);
        System.out.print("The circumference of your circle is "+circumference);
    }
}
