public class studentfees {
    public static void main(String[] args) {
        double fee = 125000;             // Original course fee
        double discountPercent = 10;     // Discount in percent

        double discount = (fee * discountPercent) / 100; // Discount amount
        double finalFee = fee - discount;                // Fee after discount

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}
