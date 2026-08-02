import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        plusMinus(arr);
    }

    public static void plusMinus(int[] arr) {
        int n = arr.length;
        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        double posRatio = (double) positive / n;
        double negRatio = (double) negative / n;
        double zeroRatio = (double) zero / n;

        System.out.printf("%.6f%n", posRatio);
        System.out.printf("%.6f%n", negRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }
}