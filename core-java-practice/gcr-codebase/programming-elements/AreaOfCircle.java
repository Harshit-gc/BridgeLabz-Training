import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        double area = 3.14*radius*radius;
        System.out.println(area);
    }
}
