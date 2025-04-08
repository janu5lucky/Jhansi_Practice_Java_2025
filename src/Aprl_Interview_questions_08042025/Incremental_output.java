package Aprl_Interview_questions_08042025;

public class Incremental_output {

	public static void main(String[] args) {
		
		
		int a = 10 ;
		
		int s = a++ + ++a;
		
		System.out.println(s);// ans should be 22 as a++ = 11 and ++a = 11 so 11+11 = 22
				
	}

}
