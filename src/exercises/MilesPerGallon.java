package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        double miles = scanner.nextDouble();
        System.out.println("Enter the amount of gas consumed: ");
        double gallons = scanner.nextDouble();
        // miles driven / gallons used = mpg;
        double mpg = miles/gallons;
        System.out.println("The miles per gallon is:" + mpg);
    }
}

