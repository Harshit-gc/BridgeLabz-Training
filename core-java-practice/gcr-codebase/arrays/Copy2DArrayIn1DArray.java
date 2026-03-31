package arrays;
import java.util.Scanner;

public class Copy2DArrayIn1DArray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int cols = input.nextInt();
		int[][] matrix = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		int[] array = new int[rows*cols];
		int k = 0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				array[k++] = matrix[i][j];
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		input.close();
 	}
}