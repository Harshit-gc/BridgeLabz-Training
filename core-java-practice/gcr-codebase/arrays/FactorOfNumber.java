package arrays;
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int i = 0;
        for (int j = 1; j <= number; j++) {
            if (number % j == 0) {
                if (i == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];                    
                    for (int k = 0; k < factors.length; k++) {
                        temp[k] = factors[k];
                    }
                    factors = temp;
                }
                factors[i++] = j;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.print(factors[j] + " ");
        }
        input.close();
    }
}