package DayFive;

import java.util.Scanner;

public class SpeedCalculation {
    public static void main(String[] args){
        System.out.println("What is the distance in kilometers?");
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        System.out.print("How long did it take to travel " +distance);
        System.out.println(" km?");
        Scanner x = new Scanner(System.in);
        int time = x.nextInt();
        double speed= (double)distance/time;
        System.out.print("Your speed is "+speed);
        System.out.print( " km/h");
    }
}
