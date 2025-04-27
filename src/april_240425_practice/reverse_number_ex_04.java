package april_240425_practice;

public class reverse_number_ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234;
		
		int rev= 0;
		for(rev=0;num!=0;) {
			rev = rev*10+num%10;
			num= num/10;
			
		}
		
		System.out.println(rev);
		
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse number : " +rev);

	}

}
