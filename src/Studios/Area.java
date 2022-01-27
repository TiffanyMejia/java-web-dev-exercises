package Studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        double radius = circle.nextDouble();

        double area = 3.14 * radius * radius;
        System.out.println("Area of circle:" + area);
    }
}