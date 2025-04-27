package April_27042025_String_practice;

import java.util.Scanner;

public class reverse_int_Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		int rev =0;
		for(rev=0;num!=0 ;) {
			rev = rev*10+num%10;
			num = num/10;
			
		}
		
		System.out.println(rev);
		
	}

}
