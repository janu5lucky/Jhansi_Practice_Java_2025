package April_270425_Arrays_practice;

public class Arrays_to_String_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "am", "good", "ok","not" };
		String str = "";
		String revStr ="";
		for (String s : arr) {
			str += s;
			revStr =s+revStr;
		}
		System.out.println(str);
		System.out.println(revStr);


	}

}
