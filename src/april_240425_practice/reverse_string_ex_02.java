package april_240425_practice;

import java.util.Scanner;

public class reverse_string_ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text :");
		String str = sc.nextLine();
		int len = str.length();
		String rev ="";
		
		for(int i=len-1; i>=0;i--) {
			
			rev +=str.charAt(i);
			
			
		}
		System.out.println("Reverse String :" +rev);

		
	}

}
