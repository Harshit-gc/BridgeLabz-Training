import java.util.*;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        float miles = distance*0.621371f;
        System.out.println(miles);
    }
}
