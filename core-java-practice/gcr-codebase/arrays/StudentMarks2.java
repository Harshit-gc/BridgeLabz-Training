package arrays;
import java.util.*;

public class StudentMarks2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];
        for (int i=0; i<number; i++) {
            for (int j=0; j<3; j++) {
                marks[i][j] = input.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Enter again.");
                    j--; 
                }
            }
        }
        for (int i=0; i<number; i++) {
            int total = 0;
            for (int j=0; j<3; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / 3.0;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentage[i]) + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
        input.close();
    }
}
