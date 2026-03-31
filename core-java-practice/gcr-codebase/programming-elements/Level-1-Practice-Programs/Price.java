import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float unitPrice = input.nextFloat();
        float quantity = input.nextFloat();
        float totalPrice = unitPrice*quantity;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}
