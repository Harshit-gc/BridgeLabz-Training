public class UniversityFees {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;
        int discountedAmount = fee/discount;
        int discountedFees = fee-discountedAmount;
        System.out.println("The Discount amount is INR "+discountedAmount+" and the final discounted fees is "+discountedFees);

    }
}
