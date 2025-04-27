package april_240425_practice;

public class separate_textandnum_Ex_05 {
 public static void main(String[] args) {
	
	
	String str = "A1b2c3d4e5";
	
	String num = str.replaceAll("[^0-9]","");
	
	String letter = str.replaceAll("[^a-zA-Z]","");

	System.out.println(num);
	
	System.out.println(letter);
		
}
}
