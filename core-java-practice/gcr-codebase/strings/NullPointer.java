package strings;

public class NullPointer {
	
    public static void stringLength(String text) {
        System.out.println("String length: " + text.length());
    }
    
    public static void safeAccessStringLength(String text) {
        try {
            stringLength(text);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled!");
        }
    }
    
    public static void main(String[] args) {
        String text = null;
        try {
            stringLength(text);
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in main()");
        }
        safeAccessStringLength(text);
    }
}