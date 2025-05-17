package My_top_100_programs_java_13052025;

public class remove_spl_characters_in_String_P14 {

	public static void main(String[] args) {
		
		String str = "!!#^!&13091831393dasdawd";
		
		remove_spl_characters_in_string_01(str);
		remove_spl_characters_in_string_02(str);
		remove_spl_characters_in_string_03(str);

	}

	public static void remove_spl_characters_in_string_01(String str) {
		
		String s = str.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println("String without spl chars Approach1 :" +s);
		
		
	}
public static void remove_spl_characters_in_string_02(String str) {
		
		String s = "";
	//	int l = str.length();
		for(char c: str.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				s+=c;
				
			}
		}
	
		System.out.println("String without spl chars Approach2 :" +s);
	}
public static void remove_spl_characters_in_string_03(String str) {
	
	String s = "";
	int l = str.length();
	for(int i=0;i<l ;i++) {
		char c = str.charAt(i);
		if(Character.isLetterOrDigit(c)) {
			s+=c;
		}
	}

	System.out.println("String without spl chars Approach3 :" +s);
}


}
