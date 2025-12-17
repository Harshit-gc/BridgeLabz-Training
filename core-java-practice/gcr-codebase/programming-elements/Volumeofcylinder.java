import java.util.Scanner;

public class Volumeofcylinder {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float radius = input.nextFloat();
            float height = input.nextFloat();
            double volume = 3.14*radius*radius*height;
            System.out.println(volume);
        }
}
