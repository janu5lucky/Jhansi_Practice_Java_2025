package My_top_100_programs_java_13052025;

public class occurance_of_chars_inString_P17 {

	public static void main(String[] args) {
		String str = "aaabbbcccddddaaa";
		accurance_ofchars_Approach1(str);// gemini 
	}

	public static void accurance_ofchars_Approach1(String str) {

		int l = str.length();
		int count = 0;
		for (int i = 0; i < l; i++) {
			 count = 0;
			char c = str.charAt(i);
			if (str.indexOf(c) == i) {
				for (int j = 0; j < l; j++) {
					if(str.charAt(j)==c) {
						count++;
					}
				}System.out.print(c + ": " + count+", ");
			}

		}

	}

}
