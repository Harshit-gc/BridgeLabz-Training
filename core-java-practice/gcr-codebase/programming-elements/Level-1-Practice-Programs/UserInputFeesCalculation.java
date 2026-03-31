import java.util.Scanner;

public class UserInputFeesCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fee = input.nextInt();
        int discountPercent = input.nextInt();
        int discountedAmount = fee/discountPercent;
        int discountedFees = fee-discountedAmount;
        System.out.println("The Discount amount is INR "+discountedAmount+" and the final discounted fees is INR "+discountedFees);
    }
}
