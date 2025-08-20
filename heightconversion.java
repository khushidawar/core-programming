import java.util.Scanner;
public class heightconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert cm to inches (1 inch = 2.54 cm)
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and inches
        int feet = (int) (totalInches / 12);
        int inches = (int) Math.round(totalInches % 12);

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches);

        input.close();
    }
}
