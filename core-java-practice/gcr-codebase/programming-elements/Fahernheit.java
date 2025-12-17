import java.util.*;

public class Fahernheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temp = input.nextFloat();
        float fahernheit = (temp*9/5) + 32;
        System.out.println(fahernheit);
    }
}
