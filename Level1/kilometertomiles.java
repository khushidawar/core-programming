import java.util.Scanner;
public class kilometertomiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // 1 mile = 1.6 km  ⇒  miles = km / 1.6
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
