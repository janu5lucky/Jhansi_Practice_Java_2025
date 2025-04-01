package My_250_plus_programs_for_practice.Strings;

public class StringBuffer_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Hi! My name is Jhansi";
		System.out.println("Input String : "+str);

		String lowstr = str.toLowerCase().replaceAll(" ", "");
		
		StringBuilder sb = new StringBuilder(lowstr);
		sb.trimToSize();
		
		System.out.println("output String : "+sb);
		

	}

}
