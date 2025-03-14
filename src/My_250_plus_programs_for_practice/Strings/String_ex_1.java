package My_250_plus_programs_for_practice.Strings;

public class String_ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		converting_string_to_int();
	}
	public static void converting_string_to_int() {
		String str = "121321321";
		String int1 ="";
		int number=0;
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				int1 +=c;
							
			}
			number=Integer.parseInt(int1);
			/*
			 * for(int j =0; j<int1.length(); j++) { //int digit =
			 * Character.getNumericValue(int1.charAt(j));
			 * 
			 * 
			 * 
			 * 
			 * }
			 */
		}
		System.out.println("String Numbers to int : "+number );

		
		
	}
	
	
}
