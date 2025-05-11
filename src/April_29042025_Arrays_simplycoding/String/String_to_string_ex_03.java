package April_29042025_Arrays_simplycoding.String;

public class String_to_string_ex_03 {

	public static void main(String[] args) {

		String str = "Jhansi92191";
		String_to_int_Approach1(str);
		System.out.println();
		String_to_int_Approach2(str);
	}

	public static void String_to_int_Approach1(String str) {
		
		int l = str.length();
		Integer num =0;
		String s ="";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				
				s+=c; 
			}
			}
		num = Integer.parseInt(s);
		System.out.println(num);
	}

public static void String_to_int_Approach2(String str) {
		
		int l = str.length();
		String s = str.replaceAll("[^0-9]", "");
		Integer num = Integer.parseInt(s);
		System.out.println(num);
	}

	
}
