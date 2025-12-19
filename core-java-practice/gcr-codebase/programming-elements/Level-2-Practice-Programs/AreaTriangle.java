import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        float area = (1.0f/2.0f)*base*height;
        float inches = area*0.393701f;
        System.out.println("The Area of the triangle in sq in is "+inches+" and sq cm is "+area);
    }
}
