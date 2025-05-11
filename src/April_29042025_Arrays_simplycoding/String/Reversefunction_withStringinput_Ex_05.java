package April_29042025_Arrays_simplycoding.String;

import java.util.Scanner;

public class Reversefunction_withStringinput_Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the single String :");
		String str = sc.nextLine();
		reversefunction(str);
		System.out.println("Enter the Integer :");
		int num = sc.nextInt();
		reversefunction(num);
		System.out.println("Enter the Sentences :");
		sc.nextLine();
		String str1 = sc.nextLine();
		reversefunctioneachword(str1);


	}

	public static void reversefunction(String str) {
		
		int l = str.length();
		String revword="";
		for(int i =l-1;i>=0;i--) {
			
			revword = revword+str.charAt(i);
			
			
		}
		System.out.println("reverse String :" +revword);
	}
	
public static void reversefunction(int num) {
		
		
		int rev=0;
		for(rev=0;num!=0;) {
			
			rev = rev*10+num%10;
			num = num/10;
			
			
		}
		System.out.println("reverse String :" +rev);
	}
	
public static void reversefunctioneachword(String str) {
	
	String[] arr = str.split(" ");
	int l = arr.length;
	String revword="";
	String reverseword="";
	for(int i=0;i<l;i++) {
		revword="";
	for(int j =arr[i].length()-1;j>=0;j--) {
		
		revword = revword+arr[i].charAt(j);
		
	}
	reverseword += revword+" ";
	}
	System.out.println("reverse of each word :" +reverseword);
}

	
}
