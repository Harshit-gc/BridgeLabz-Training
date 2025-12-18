import java.util.*;

public class UserInputkmtomiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Distance = input.nextDouble();
        double miles = Distance*0.621371;
        System.out.println(miles);
    }
}
