package My_250_plus_programs_for_practice.Strings;

public class String_comparision_Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comparision_of_string_basic_type1();
		Comparision_string_using_stringBuffer_Builder();


	}
	
	public static void Comparision_of_string_basic_type1() {
		String s1 = "Hi";
		String s2 = "Hi";
		String s3 = new String("Hi");
		String s4 = new String("Hi");
		
		System.out.print("Comparing S1 == S2 : "); System.out.println(s1==s2);// writes true as both s1 and s2 share same reference memory
		System.out.print("Comparing S1 == S3 : "); System.out.println(s1==s3);// writes false as both s1 and s3 share different reference memory
		System.out.print("Comparing S3 == S4 : "); System.out.println(s3==s4);// writes false as both s3 and s4 share different memory in Heap space
		System.out.println("Comparing S1.equalS2"+s1.equals(s2));// true as both s1 and s2 compared with content
		System.out.println("Comparing S1.equalS3"+s1.equals(s3));// writes true as both s1 and s3 Content is same 
		System.out.println("Comparing S3.equalS4"+s3.equals(s4));// writes true as both s3 and s4 content is same 

		
	}

	public static void Comparision_string_using_stringBuffer_Builder() {
		String s1 = "Hi";
		String s2 = "Hi";
		String s3 = new String("Hi");
		String s4 = new String("Hi");
		StringBuffer s5 = new StringBuffer(s1);
		StringBuffer s6 = new StringBuffer(s2);
		StringBuilder s7 = new StringBuilder(s3);
		StringBuilder s8 = new StringBuilder(s4);

		System.out.print("Comparing S5 compare S6 : "); System.out.println(s5.compareTo(s6));
	//	System.out.print("Comparing S1==S5 : "); System.out.println(s1==s5); // not possible 
		System.out.print("Comparing S7 compare S8 : "); System.out.println(s7.compareTo(s8));
		System.out.println("Comparing S1 compare S8 : "+s1.equals(s8));
		System.out.println("Comparing S4 compare S3 : "+s4.equals(s3));

		


		System.out.println(s7.append(" Jhansi"));
	}


	
}
