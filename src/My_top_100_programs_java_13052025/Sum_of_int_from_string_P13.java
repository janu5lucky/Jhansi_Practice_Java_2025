package My_top_100_programs_java_13052025;

public class Sum_of_int_from_string_P13 {

	public static void main(String[] args) {

		String str = "a1b2c4n5";
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				sum = sum+Character.getNumericValue(c);
			}
		}System.out.println(sum);
		
	}

}
