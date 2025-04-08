package My_250_plus_programs_for_practice.Strings;

public class CapsInString_Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		identifycaps_inString();
		identifycaps_inString_andreplace();
		identifycaps_inString_reverse_and_repalce();
	}

	public static void identifycaps_inString(){
		
		String s = "SeleniUm";
		for(int i = 0;i< s.length();i++) {
			
			char c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				System.out.println(c);
			
			}
		}

	}
public static void identifycaps_inString_andreplace(){
		
		String s = "SeleniUm";
		String n ="";
		for(int i = 0;i< s.length();i++) {
			
			char c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				//System.out.println(c);
			c='@';
			//System.out.println(c);
			}
			 n =n+c;
		}
		System.out.println(n);

	}
public static void identifycaps_inString_reverse_and_repalce(){
	
	String s = "SeleniUm";
	String n ="";
	for(int i=s.length()-1;i>=0;i--) {
		
		char c = s.charAt(i);
		
		if(Character.isUpperCase(c)) {
			//System.out.println(c);
		c='@';
		//System.out.println(c);
		}
		 n =n+c;
	}
	System.out.println(n);

}

 
}

