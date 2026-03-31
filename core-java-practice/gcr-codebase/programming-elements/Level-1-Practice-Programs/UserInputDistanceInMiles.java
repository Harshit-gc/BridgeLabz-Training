import java.util.*;

public class UserInputDistanceInMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance = input.nextDouble();
        double miles = distance*0.621371;
        System.out.println(miles);
    }
}
