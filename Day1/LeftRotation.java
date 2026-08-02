import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = rotLeft(a, d);

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            output.append(result[i]);
            if (i != result.length - 1) {
                output.append(" ");
            }
        }

        System.out.println(output.toString());
    }

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i - d + n) % n;
            rotated[newIndex] = a[i];
        }

        return rotated;
    }
}