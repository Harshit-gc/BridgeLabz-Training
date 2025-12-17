import java.util.*;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt(); //Principal
        float r = input.nextFloat(); //Rate of Interest\
        int t = input.nextInt(); //Time
        float si = (p*r*t)/100;
        System.out.println(si);
    }
}
