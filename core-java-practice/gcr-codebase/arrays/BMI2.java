package arrays;
import java.util.*;

public class BMI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i=0; i<number; i++) {
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Weight must be positive");
            }
            while (true) {
                System.out.print("Enter height (meters): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Height must be positive");
            }
        }
        for (int i=0; i<number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i=0; i<number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
        input.close();
    }
}
