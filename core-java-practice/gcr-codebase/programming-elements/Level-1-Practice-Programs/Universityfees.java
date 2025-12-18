public class Universityfees {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;
        int discounted_amount = fee/discount;
        int discounted_fees = fee-discounted_amount;
        System.out.println("The Discount amount is INR "+discounted_amount+" and the final discounted fees is "+discounted_fees);

    }
}
