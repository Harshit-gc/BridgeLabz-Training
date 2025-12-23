package strings;
import java.util.Scanner;

public class Lowercase {
    static String generateLowerCase(String str){
        String lowerCase ="";
        for(char c:str.toCharArray()){
            if (c == ' ') {
                lowerCase += " ";  // Preserve spaces
            } else if (c >= 'A' && c <= 'Z') {
                lowerCase += (char)(c + 32);  // A->a: add 32
            } else if (c >= 'a' && c <= 'z') {
                lowerCase += c;  // Already lowercase
            } else {
                lowerCase += c;  // Non-letter characters
            }
        }
        return lowerCase;
    }
    
    static boolean compareString(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String strInLowerCaseBuiltIn = str.toLowerCase();
        String strInLowerCaseManual = generateLowerCase(str);
        if(compareString(strInLowerCaseBuiltIn,strInLowerCaseManual)){
            System.out.println("Both Strings are equal & in lower case: "+strInLowerCaseManual);
        }else{
            System.out.println("Both Strings are not equal");
        }
        input.close();
    }
}