package Practice_01012025;

import java.util.Scanner;

public class frizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);

System.out.println("Enter the number a = ");
int a = input.nextInt();

for(int i=1;i<=a;i++) {
	
	if ((i%3==0)&&(i%5==0))
	{
		System.out.println("FrizzBuzz");

	}
	else if (i%3==0) {
		System.out.println("Frizz");

	}
	
	else if (i%5==0) {
		System.out.println("Buzz");

	}
	else {
		System.out.println(i);

		
	}
}
		
	}

}
