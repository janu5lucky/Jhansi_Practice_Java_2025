package april_240425_practice;

public class addnumbersin_string_ex_05 {

	public static void main(String[] args) {
 
		String str = "a1b23c34d44e5";
		String num = str.replaceAll("[^0-9]","");
		String word = str.replaceAll("[^a-zA-Z]","");
		System.out.println(num);
		System.out.println(word);
		int n =0;
		for(int i=0; i<num.length();i++) {
			char c = num.charAt(i);
			if(Character.isDigit(c)) {
				n = n+Character.getNumericValue(c);
				
			}			
		}
	System.out.println(n);
	
	}

}
