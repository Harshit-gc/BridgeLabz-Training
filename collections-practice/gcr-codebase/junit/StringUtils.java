package bridgelabz.junit;

public class StringUtils {
	
	public String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public boolean isPalindrome(String str) {
		String reversed = reverse(str);
		if(str.equals(reversed)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
