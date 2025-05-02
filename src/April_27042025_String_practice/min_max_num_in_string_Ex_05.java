package April_27042025_String_practice;

public class min_max_num_in_string_Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		min_max_in_string_approach01();
		min_max_in_string_approach2();
		}

	public static void min_max_in_string_approach01() {
		String str = "Jhansi91309173";
		int min=0;
		int max =0;
		String nums = str.replaceAll("[^0-9]", "");
		int l = nums.length();

		for(int i=0;i<l;i++) {
			char c = nums.charAt(i);
			for(int j=i+1;j<l-1;j++) {
				char s =nums.charAt(j);
			if(Character.isDigit(c)) {
				
			int n1 = Character.getNumericValue(c);
			//min =Character.getNumericValue(nums.charAt(0));
		//	System.out.println("before call min :"+min);
			//max= n1;
			int n2 = Character.getNumericValue(s);
				if(n1 <n2 ) {
					min =n1;
				}if(n1>n2) {
					max =n1;
				}
			}
			
		}
		}System.out.println("min digit : "+min);
		System.out.println("max digit : "+max);
		

	}
public static void min_max_in_string_approach2() {
	
	String str = "Jhansi91309173";
	int min=0;
	int max =0;
	String nums = str.replaceAll("[^0-9]", "");
	int l = nums.length();

	for(int i=0;i<l;i++) {
		char c = nums.charAt(i);
		if(Character.isDigit(c)) {
		int n = Character.getNumericValue(c);
			if(n<min) {
				min =n;
			}if(n>max) {
				max =n;
			}
		}
		
	}
	System.out.println("min digit : "+min);
	System.out.println("max digit : "+max);
	

	
}
}
