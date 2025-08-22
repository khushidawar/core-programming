import java.util.Scanner;
public class studentfeesuniversitydiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for fee
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        // Taking input for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculations
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
