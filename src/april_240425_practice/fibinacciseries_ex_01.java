package april_240425_practice;

import java.util.Scanner;

public class fibinacciseries_ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number for fibinacci series: ");
		int num = sc.nextInt();
		int sum =0;
		int n1=0;
		int n2 = 1;
		System.out.print(n1+" "+n2);
		
		for(int i = 0; i<=num;i++) {
			
			sum = n1+n2;
			n1 = n2;
			n2 = sum ;
			System.out.print(" "+sum);

		}
		
	}

}
