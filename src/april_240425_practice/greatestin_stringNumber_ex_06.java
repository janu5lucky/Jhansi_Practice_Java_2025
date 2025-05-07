package april_240425_practice;

public class greatestin_stringNumber_ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a1b23c34d44e589";
		String num = str.replaceAll("[^0-9]","");
		String word = str.replaceAll("[^a-zA-Z]","");
		System.out.println(num);
		System.out.println(word);
		int max =0;
		int min =0;

		int n =0;
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			
			if(Character.isDigit(c)) {
				for(int j=1;j<str.length();j++) {
					char b = str.charAt(j);
					int m = Character.getNumericValue(b);
					n = Character.getNumericValue(c);
				
				if(n>m) {
				max = n;
				}
				
				
				}
				
			}			
		}
		System.out.println(max);
		System.out.println(min);

	}

}
