package arrays;
import java.util.Scanner;

public class HeightOfPlayers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] height = new double[11];
		double sum = 0.0;
		for(int i=0; i<height.length; i++) {
			height[i] = input.nextDouble();
			sum += height[i];
		}
		System.out.println("Mean Height of Players: "+sum/11);
		input.close();
	}
}