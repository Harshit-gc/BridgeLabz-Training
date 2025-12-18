import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float sum = num1+num2;
        float sub = num1-num2;
        float multiply = num1*num2;
        float division = num1/num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+sum+", "+sub+", "+multiply+", "+division);
    }
}
