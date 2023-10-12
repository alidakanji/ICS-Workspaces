package DayFive;

import java.util.Scanner;

public class CastingWithTimeConversion {
    public static void main(String[] args){
        System.out.println("What is the total time (in minutes)?");
        Scanner input = new Scanner(System.in);
        int totalMinutes = input.nextInt();
        double hours= totalMinutes/60;
        System.out.print((int)hours+" Hours ");
        int minutes=totalMinutes-(((int)totalMinutes/60)*60);
        System.out.print((int)minutes+" Minutes");
    }
}
