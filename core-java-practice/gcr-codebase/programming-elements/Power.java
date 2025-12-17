import java.util.*;

public class Power {
    public static int power(int base, int exponent){
        if(exponent==0){
            return 1;
        }
        return base*power(base,exponent-1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exponent = input.nextInt();
        System.out.println(power(base,exponent));
    }
}
