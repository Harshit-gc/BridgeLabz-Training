import java.util.Scanner;

public class StudentsHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();
        int possibleHandshakes = (students*(students-1))/2;
        System.out.println("Possible Handshkes by the "+students+" students are "+possibleHandshakes);
    }
}
