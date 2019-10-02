import java.util.Scanner;

public class apcsa_circle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nPlease enter the diameter of a circle: ");
        double circleDiameter = in.nextDouble();

        double circleArea = Math.PI * Math.pow((circleDiameter/2),2);
        System.out.print("\nThe area of a circle with a diameter of "
         + String.format("%.1f",circleDiameter) + " is " +
         String.format("%.1f",circleArea) + ".\n");

    }
}
