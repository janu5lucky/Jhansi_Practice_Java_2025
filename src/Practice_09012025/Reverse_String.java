package Practice_09012025;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseSrting_With_forLoop();
		Reverse_Each_word_of_the_string();
		Reverse_Each_word_of_the_string_StringBuffer();
		Reverse_Sentence_forLoop();
		Reverse_Each_word_of_the_string_StringBuilder();
		Reverse_Each_word_of_the_string_StringBuffer_and_builder();
		Reverse_Sentence_using_StringBuilder();
	
	}
	
	public static void ReverseSrting_With_forLoop() {
		
		String input ="Jhansi";
		
		String output = "";
		
		int len = input.length();
		
		for(int i=len-1;i>=0;i--) {
			output = output+input.charAt(i);
			
	
		}
	System.out.println(output);
	
	}
public static void Reverse_Each_word_of_the_string() {
		
		String input ="Hi! My Name is Jhansi";//This is the original Srting
		
		// Split the each word based on Space given 
		
		String[] splitwords = input.split(" ");
		
		
		String reversestring = "";
		
		
		for(String W:splitwords) {

			String reversewords ="";
			
			for(int i = W.length()-1; i>=0;i--) {
				
				reversewords =reversewords+W.charAt(i);
				
			}
			reversestring= reversestring+reversewords+" ";
			
	}
	System.out.println(reversestring);
	
	}
	

public static void Reverse_Each_word_of_the_string_StringBuffer() {
	
	String input ="Hi! My Name is Jhansi";//This is the original Srting
	
	// Split the each word based on Space given 
	
	String[] splitwords = input.split(" ");
	
	String reversewords ="";

	
	
	for(String W:splitwords) {

		
		StringBuffer sb=new StringBuffer(W);
		sb.reverse();
		
		reversewords= reversewords+sb.toString()+" ";
		
}
System.out.println(reversewords);

}
public static void Reverse_Sentence_forLoop() {
	
	String input ="Hi! My Name is Jhansi";//This is the original Srting
	
	// Split the each word based on Space given 
	
	String[] splitwords = input.split(" ");
	
	String reverseString ="";
	
	int len = splitwords.length;
	
	
	for(int i=len-1; i>=0;i--) {

		
		reverseString=reverseString+splitwords[i]+" ";
		
		
}
System.out.println(reverseString);

}

public static void Reverse_Each_word_of_the_string_StringBuffer_and_builder() {
    String input = "Hi! My Name is Jhansi";  // This is the original String

    // Split the input string into words based on spaces
    String[] splitwords = input.split(" ");
    
    StringBuilder reversewords = new StringBuilder(); // Using StringBuilder for better performance

    for (String word : splitwords) {
        StringBuffer sb = new StringBuffer(word);  // Create a StringBuffer from each word
        sb.reverse();  // Reverse the word
        
        reversewords.append(sb.toString()).append(" ");  // Append the reversed word to the StringBuilder
    }

    // Trim the trailing space and print the result
    System.out.println(reversewords.toString().trim());
}

public static void Reverse_Each_word_of_the_string_StringBuilder() {
	
	String input ="Hi! My Name is Jhansi";//This is the original Srting
	
	// Split the each word based on Space given 
	
	String[] splitwords = input.split(" ");
	
	String reversewords ="";

	
	
	for(String W:splitwords) {

		
		StringBuilder sb=new StringBuilder(W);
		sb.reverse();
		
		reversewords= reversewords+sb.toString()+" ";
		
}
System.out.println(reversewords);


}

public static void Reverse_Sentence_using_StringBuilder() {
	
	String input ="Hi! My Name is Jhansi";//This is the original Srting
	
	// Split the each word based on Space given 
	
	//String[] splitwords = input.split(" ");
	
	StringBuilder reversesentence = new StringBuilder(input);
	reversesentence.reverse();
	System.out.println(reversesentence);


}


}