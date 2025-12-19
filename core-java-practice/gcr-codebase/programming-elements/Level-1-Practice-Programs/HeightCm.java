import java.util.Scanner;

public class HeightCm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float height = input.nextFloat();
        float inches = height*0.393701f;
        int feet = (int)inches/12;
        float inch = inches-(feet*12);
        System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inch);
    }    
}
