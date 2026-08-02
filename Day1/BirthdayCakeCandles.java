import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candles = new int[n];

        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }

        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }

    public static int birthdayCakeCandles(int[] candles) {
        int max = 0;
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] > max) {
                max = candles[i];
            }
        }

        int count = 0;
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] == max) {
                count++;
            }
        }

        return count;
    }
}