import java.util.Scanner;

public class ArrayDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = reverseArray(arr);

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            output.append(result[i]);
            if (i != result.length - 1) {
                output.append(" ");
            }
        }

        System.out.println(output.toString());
    }

    public static int[] reverseArray(int[] a) {
        int n = a.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = a[n - 1 - i];
        }

        return reversed;
    }
}