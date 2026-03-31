import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while(num>0){
            int ld = num%10;
            System.out.print(ld);
            num = num/10;
        }
    }
}