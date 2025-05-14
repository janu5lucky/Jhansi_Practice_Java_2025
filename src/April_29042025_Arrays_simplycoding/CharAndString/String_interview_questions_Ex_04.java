package April_29042025_Arrays_simplycoding.CharAndString;

public class String_interview_questions_Ex_04 {

	public static void main(String[] args) {

	//	MaxLength_word_in_sentence_Approach1();
	//	Second_MaxLength_word_in_sentence_Approach1();
		
		Separate_Words_from_string_without_split();
	}

	public static void MaxLength_word_in_sentence_Approach1() {

		String str = "Hi This is java programming language exercise overwhelmingjoy";
		String[] arr = str.split(" ");
		int l = arr.length;
		int maxlength = arr[0].length();
		String s = "";
		for (int i = 0; i < l; i++) {
			if (arr[i].length() > maxlength) {
				maxlength = arr[i].length();

			}
			if (maxlength == arr[i].length()) {
				s = arr[i];
			}

		}
		System.out.println("max length word : " + s);

	}

	public static void Second_MaxLength_word_in_sentence_Approach1() {

		String str = "Hi This is java programming language overwhelmingjoy exercise";
		String[] arr = str.split(" ");
		int l = arr.length;
		int maxlength = arr[0].length();
		int secondmaxlength = arr[0].length();
		String s = "";
		String s2 = "";

		for (int i = 0; i < l; i++) {
			if (arr[i].length() > secondmaxlength && arr[i].length() != maxlength) {

				secondmaxlength = arr[i].length();
			}
			if (arr[i].length() > maxlength) {
				secondmaxlength = maxlength;
				maxlength = arr[i].length();
			}
			if (maxlength == arr[i].length()) {
				s = arr[i];
			}
			if (secondmaxlength == arr[i].length()) {
				s2 = arr[i];
			}

		}
		System.out.println("max length word : " + s);
		System.out.println("second max length word : " + s2);

	}

	public static void Separate_Words_from_string_without_split() {

		String str = "Hi This is java programming language overwhelmingjoy exercise";
		str += " ";

		String word = "";
		int end = 0, position = 0;
		while(str.indexOf(' ',position)>0) {
			
			end = str.indexOf(' ', position);
			word = str.substring(position,end);
			
			position = end+1;
			
		};
	
	
	}

}
