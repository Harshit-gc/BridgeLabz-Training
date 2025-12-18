import java.util.*;

public class Distanceinyards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float distance = input.nextFloat();
        float yards = distance/3;
        float miles = yards/1760;
        System.out.println("The distance in yards is "+yards+" miles is "+miles);
    }
}
