import java.util.Scanner;
public class yardsmilesfeets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // Convert to yards and miles
        double yards = feet / 3.0;
        double miles = feet / 5280.0;

        // Output
        System.out.println("The distance is " + feet + " feet, which is " +
                yards + " yards and " + miles + " miles.");

        input.close();
    }
}
