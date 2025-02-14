package Practice_05012025;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Side a : ");
		int a = input.nextInt();
		System.out.println("Enter Side b : ");
		int b = input.nextInt();
		System.out.println("Enter Side c : ");
		int c = input.nextInt();
		
		if(a==b||b==c) {
			System.out.println("Given Triangle is Equilateral");

		}
		
		else if(a==b+c||b==c+a||c==a+b) {
			System.out.println("Given Triangle is right angle");

		}
		else if(a!=b||b!=c) {
			System.out.println("Given Triangle is not Equilateral");

		}
		
	}

}
