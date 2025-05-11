package April_29042025_Arrays_simplycoding.String;

public class printeachchar_in_string_ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "JhansI-93944!@";
		//printeachchar_Aproach1(str);
	//	printeachchar_Aproach2(str);
//		printeachcharAscii(str);
		printeachchar_uppercase(str);
		printeachchar_lowercase(str);
		printeachchar_Digits(str);
		System.out.println();
		printeachchar_letterordigit(str);
		System.out.println();
		printeachchar_Notletterordigit(str);
		
	}

	public static String printeachchar_Aproach1(String str) {

		for (char c : str.toCharArray()) {

			System.out.println(c);
		}
		return str;

	}

	public static void printeachchar_Aproach2(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}
	public static void printeachcharAscii(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c+" "+(int)c);
		}
	}

	public static void printeachchar_uppercase(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c))
			System.out.println(c);
		}
	}

	public static void printeachchar_lowercase(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLowerCase(c))
			System.out.println(c);
		}
	}
	public static void printeachchar_Digits(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c))
			System.out.println(c);
		}
	}
	public static void printeachchar_letterordigit(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLetterOrDigit(c))
			System.out.println(c);
		}
	}
	public static void printeachchar_Notletterordigit(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!Character.isLetterOrDigit(c))
			System.out.println(c);
		}
	}
}
