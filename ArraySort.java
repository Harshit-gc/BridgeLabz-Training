package review;
import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
			arr[i] = (int)Math.pow(arr[i],2);
		}
		Arrays.sort(arr);
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		input.close();
	}

}
