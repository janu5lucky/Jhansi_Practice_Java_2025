package april_240425_practice;

public class reverse_eachstring_insentence_ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am Jhansi This is good";
		String[] words = str.split(" ");
		String reverseword;
		String reverseSentence = "";
		
		
		for(String word : words) {
			reverseword = "";
			for(int i =word.length()-1;i>=0;i--) {
				
				reverseword = reverseword+word.charAt(i);
			}
			reverseSentence += reverseword + " ";

		}

		System.out.println(reverseSentence);

	}

}
