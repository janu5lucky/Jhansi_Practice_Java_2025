package April_29042025_Arrays_simplycoding.CharAndString;

public class String_interview_questions_Ex_03 {

	public static void main(String[] args) {

//		replace_upper_to_lower();
//		reverse_string_and_replace_upper();
//		reverse_string_and_replace_upper2();
		reverse_string_and_replace_upper3();
		
	}

	public static void replace_upper_to_lower() {

		String s = "Hello";
		s = s.toLowerCase();
		System.out.println(s);

	}

	public static void reverse_string_and_replace_upper() {

		String s = "Hello";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		rev = rev.replace('H', 'f');
		System.out.println(rev);
	}

	public static void reverse_string_and_replace_upper2() {

		String s = "HellO";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + s.charAt(i);
			if (Character.isUpperCase(c)) {
				rev = rev.replace(c, Character.toLowerCase(c));
			}
		}
		System.out.println(rev);
	}
	public static void reverse_string_and_replace_upper3() {

		String s = "HellO";
		String str ="";
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				str +=  Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				str += Character.toUpperCase(c);

			}else {
				str += c;
			}
		}
		System.out.println(s);
	}

}
