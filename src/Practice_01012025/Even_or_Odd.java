package Practice_01012025;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_given_number_is_Even_or_Odd();
		find_OddandEven_InAn_Array();
		
					
		}
	
	public static void find_given_number_is_Even_or_Odd()
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Entere a number A = ");

		int a = input.nextInt();
		
		if (a%2 ==0 ) {
			
			System.out.println("Entered number is Even");
		}
		
		else if (a%2!=0) {
		
			System.out.println("Entered number is Odd");

		}
		

	}
	
	public static void find_OddandEven_InAn_Array()
	{
		

		int[] arraynum = { 2, 3, 4, 5, 6, 8, 9, 10, 11};
		int len = arraynum.length;
		System.out.println(len);
		int[] Odd = new int[10];
		int[] Even = new int[10];
		int num ;
		
		for(int i=0;i<len;i++) {
		 
			num = arraynum[i];	
		
		if (num%2 ==0 ) {
			
			 Even[i]=num; 
			System.out.print("Even Numbers : "+Even);
		}
		
		else if (num%2!=0) {
		
			Odd[i] = num; 
			System.out.print("Even Numbers : "+Odd);
		}
		
		
	}
	
	}
	
}
