package Practice_05012025;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		//int num = input.nextInt();
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2); 
		
		 for(int i=2; i<=10;i++) {
			 sum=n1+n2;
				System.out.print(" "+sum); 
				n1 =n2;
				n2=sum;
		 }

	}

}
