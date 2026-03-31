public class Profit {
    public static void main(String[] args) {
        int cp = 129; // Cost Price
        int sp = 191; // Selling price
        int profit = sp-cp;
        float percentage = ((float)profit/cp)*100;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\nThe Profit is INR "+profit+" and Profit Percentage is INR "+percentage);
    }
}
