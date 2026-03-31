package arrays;
import java.util.*;

public class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for (int i=0; i<3; i++) {
            System.out.print("Enter age: ");
            age[i] = input.nextInt();
            System.out.print("Enter height (in cm): ");
            height[i] = input.nextInt();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i=1; i<3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("Youngest Friend Age: " + age[youngestIndex]);
        System.out.println("Tallest Friend Height: " + height[tallestIndex]);
        input.close();
    }
}
