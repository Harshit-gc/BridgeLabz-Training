package class_and_object;
import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    int itemPrice;

    public Item(int itemCode, String itemName, int itemPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int Display() {
        System.out.println("itemCode: " + itemCode);
        System.out.println("itemName: " + itemName);
        System.out.println("itemPrice: " + itemPrice);
        return itemPrice;
    }
}

public class TrackInventoryOfItems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of Items: ");
        int n = input.nextInt();
        int totalAmount = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter itemCode: ");
            int itemCode = input.nextInt();
            System.out.println("Enter itemPrice: ");
            int itemPrice = input.nextInt();
            System.out.println("Enter itemName: ");
            String itemName = input.next();
            Item item = new Item(itemCode, itemName, itemPrice);
            totalAmount += item.Display();
        }
        System.out.println("Total Amount: " + totalAmount);
        input.close();
    }
}
