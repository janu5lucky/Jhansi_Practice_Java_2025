package My_top_100_programs_java_13052025;

public class reverse_int_P08 {
	
	public static void main(String[] args) {
		
		int num = 232321;
		int rev =0;
		int newnum = num;

		for(rev=0;num!=0;) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println(rev);
		palindrome(newnum, rev);
//		System.out.println(newnum==rev);
		
	}
	
	public static void palindrome(int num,int rev) {

		if(num==rev) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}

}
