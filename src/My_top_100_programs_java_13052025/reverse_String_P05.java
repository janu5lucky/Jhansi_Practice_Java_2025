package My_top_100_programs_java_13052025;

public class reverse_String_P05 {

	public static void main(String[] args) {

		String s = "jhansi";
		
		int l = s.length();
		String revword="";
		for(int i =l-1;i>=0;i--) {
			
			revword = revword+s.charAt(i);
			
		}
		System.out.println(revword);
	}

}
