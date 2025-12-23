package strings;
import java.util.Scanner;

public class LengthOfString {
    static int findingLength(String s){
        int count=0;
        try{
            while(true){
                char c = s.charAt(count);
                count++;
            }
        }catch (StringIndexOutOfBoundsException e){
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int lenManually=findingLength(str);
        int len=str.length();
        System.out.println("Length using user defined method: "+lenManually);
        System.out.println("Length using builtin length method: "+len);
        input.close();
    }
}