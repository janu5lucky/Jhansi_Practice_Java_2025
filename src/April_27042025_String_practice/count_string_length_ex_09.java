package April_27042025_String_practice;

public class count_string_length_ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = 0;
		String str = "HelloWorld";
		int l = str.length();
		System.out.println("l = "+l);
		for(int i =0;i<str.length();i++) {
			count++;
			
		}
		System.out.println("length of string " +count);
	}

}
