package DayFive;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args){
        System.out.println("What is the temperature in Fahrenheit?");
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = (fahrenheit-32)*5/9;
        System.out.print("The temperature in Celsius is " +celsius);
    }
}
