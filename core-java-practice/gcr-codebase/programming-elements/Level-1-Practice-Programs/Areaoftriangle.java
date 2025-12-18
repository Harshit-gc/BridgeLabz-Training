import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        float Area = (1.0f/2.0f)*base*height;
        System.out.println("Area of Traingle is "+Area);
    }
}
