package April_27042025_String_practice;

public class reverse_String_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Mathematics";
		int l = str.length();
		String revstr="";
		for(int i=l-1;i>=0;i--) {
			revstr = revstr+str.charAt(i);
			
			
		} System.out.println(revstr);
		
	}

}
