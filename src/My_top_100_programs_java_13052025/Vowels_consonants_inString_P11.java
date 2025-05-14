package My_top_100_programs_java_13052025;

public class Vowels_consonants_inString_P11 {

	public static void main(String[] args) {

		String str = "Jhansi";
		//String vowels ="";
	//	String consonants ="";
		vowels_fromString(str);

	}
	
	public static void vowels_fromString(String str) {
		
		String tolower = str.toLowerCase();
		String vowels ="";
		String consonants ="";
		for(char c : tolower.toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels =vowels+c;
			}else {
				consonants = consonants+c;
			}
		}System.out.println(vowels);
		System.out.println(consonants);
	}
}
