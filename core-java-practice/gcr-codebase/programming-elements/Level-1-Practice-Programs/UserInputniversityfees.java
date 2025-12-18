import java.util.Scanner;

public class UserInputniversityfees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fee = input.nextInt();
        int discountPercent = input.nextInt();
        int discounted_amount = fee/discountPercent;
        int discounted_fees = fee-discounted_amount;
        System.out.println("The Discount amount is INR "+discounted_amount+" and the final discounted fees is INR "+discounted_fees);
    }
}
