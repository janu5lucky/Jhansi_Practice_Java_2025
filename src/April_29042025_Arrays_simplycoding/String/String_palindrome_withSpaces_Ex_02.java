package April_29042025_Arrays_simplycoding.String;

public class String_palindrome_withSpaces_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Race car";
		String newstr = str.replaceAll("\\s", "").toLowerCase();
		String revword ="";
		for(int i=newstr.length()-1;i>=0;i--) {
			
			revword += newstr.charAt(i);
		}
		
		System.out.println(newstr.equals(revword));
		
	}

}
