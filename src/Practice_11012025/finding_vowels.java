package Practice_11012025;

public class finding_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finding_vowels_withArrays();
		
	}

	public static void finding_vowels_withArrays() {
		
		char[] vowels = {'a','e','i','o','u'};
		
		String word = "jhansi";
		
		for(int i=0;i<=word.length();i++) {
			
			for(int j=0;j<=i;j++) {
			
			if(word.charAt(i)==vowels[j]) {
				
				System.out.println("Word has Vowels");
			}
			System.out.println("Word has only consonants");

			}
			}
			
	}
	
}
