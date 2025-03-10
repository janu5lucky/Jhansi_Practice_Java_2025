package Practice_09012025;

import java.util.Scanner;

public class palindrome_with_methods {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Given_number_is_Palidrome_with_Whileloop();
		//Given_number_is_Palidrome_with_forloop();
	//	Given_String_is_Palidrome_with_StringBuffer();
	//	Given_String_is_Palidrome_with_ForLoop();
		Given_number_is_Palidrome_with_StringBuffer();

		
	}

	public static void Given_number_is_Palidrome_with_Whileloop(){
		
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		num = input.nextInt();
		int org_num=num;
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse number : " +rev);

		if(org_num==rev) {
			System.out.println("Given number is Palindrome");

		}else {
			System.out.println("Given number is Not Palindrome");
		}
		
	}
	
public static void Given_number_is_Palidrome_with_forloop(){
		
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		num = input.nextInt();
		int org_num=num;
		int rev;
		for (rev=0;num!=0;) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse number : " +rev);

		if(org_num==rev) {
			System.out.println("Given number is Palindrome");

		}else {
			System.out.println("Given number is Not Palindrome");
		}
		
	}
public static void Given_number_is_Palidrome_with_StringBuffer(){
	
	int num;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number");
	num = input.nextInt();
	int org_num=num;
	StringBuffer rev;
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	rev = sb.reverse();
	
	System.out.println("Reverse number : " +rev);
	
	StringBuffer num2 = new StringBuffer(String.valueOf(org_num));

 if(num2.equals(rev)) { System.out.println("Given number is Palindrome");
	 
	 }else { System.out.println("Given number is Not Palindrome"); }
	
	
}

public static void Given_String_is_Palidrome_with_StringBuffer(){
	
	String text;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the String");
	text = input.nextLine();
	
	StringBuffer revword;
	StringBuffer sb = new StringBuffer(text);
	revword = sb.reverse();
	
	System.out.println("Reverse String is : " +revword);
	if (text.contentEquals(revword)) {
		System.out.println("Given String is Palindrome");
	}else {
		System.out.println("Given String is Not Palindrome");
	}

	
	
}

public static void Given_String_is_Palidrome_with_ForLoop(){
	
	String text;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the String");
	text = input.nextLine();
	
	String Org_text = text;
	String revword="";
	int len= text.length();
	for(int i=len-1;i>=0;i--)
	
	{	
		revword = revword+text.charAt(i);
	}
	
	System.out.println("Reverse String is : " +revword);
	if (text.contentEquals(revword)) {
		System.out.println("Given String is Palindrome");
	}else {
		System.out.println("Given String is Not Palindrome");
	}
	}
	/*
	 * if(org_num==rev) { System.out.println("Given number is Palindrome");
	 * 
	 * }else { System.out.println("Given number is Not Palindrome"); }
	 */
	

}
