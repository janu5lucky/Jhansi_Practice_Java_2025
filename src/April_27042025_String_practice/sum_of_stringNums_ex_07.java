package April_27042025_String_practice;

public class sum_of_stringNums_ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jhansi8247783596";
		int l = str.length();
		int sum =0;
		int num = 0;
	//	num = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		String str1 = str.replaceAll("[^0-9]", "");
		for(int i=0;i<str1.length();i++) {
			char c = str1.charAt(i);
			if(Character.isDigit(c)) {
			num = Character.getNumericValue(c);
			sum += num;
			}

		}System.out.println(sum);
		
		

	}

}
