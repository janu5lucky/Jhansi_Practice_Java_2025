package My_250_plus_programs_for_practice.Strings;

public class counting_in_string_Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Identify_vowelsandconsonent_count_in_String();
	}

	public static void Identify_vowelsandconsonent_count_in_String() {
		
		String text = "Hi! Hello, This Is Jhansi";
		String newtext = text.toLowerCase().replaceAll("[^a-z]", "");////.toString();
		int countv=0;
		int countc = 0;
		int len = newtext.length();
		char c ;
		
		System.out.println("String with lowercase and only alphabetic characters: " + newtext);
		for(int i=0 ; i<len; i++)
		{
            c = newtext.charAt(i);
			if (c == 'a'||c=='e'||c=='i'||c=='o'||c=='u'  ) {
				countv++;
				
			}else 
			{
				countc++;
				
			}
				
			
		}
		
		
		System.out.println ("number of vowels : "+countv);
		System.out.println ("number of consonants : "+countc);

		
		
	}
	
}
