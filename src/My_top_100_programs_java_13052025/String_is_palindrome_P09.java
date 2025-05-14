package My_top_100_programs_java_13052025;

public class String_is_palindrome_P09 {

	public static void main(String[] args) {
		String s ="assa";
		String rev ="";
		palindrome_String(s,rev);
		
	}
public static void palindrome_String(String s, String rev) {
	
	int l = s.length();
	for(int i =l-1;i>=0;i--) {
		rev = rev+ s.charAt(i);
		
	}if(s.equals(rev)) {
		System.out.println("String is Palindrome");
	}else {
		System.out.println("String is not Palindrome");
	}
}
}
