package Practcie_11012025;

import java.util.Arrays;

public class largest_number_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Try programiz.pro");
	 //       String name = "Jhansi393";
	   //     String[] word = name.split("0-9");
	    //    System.out.print(Arrays.toString(word));
	      //  String[] num = name.split("a-z");
	        // System.out.print(Arrays.toString(num));	
		solution_from_gemini();
}

public static void solution_from_gemini() {
String input = "Jhansi802379";
String numberPart = "";
String WordPart = "";

int largestDigit = 0;

// Extract the number part from the string
for (int i = 0; i < input.length(); i++) {
    char c = input.charAt(i);
    if (Character.isDigit(c)) {
        numberPart += c;
       
    }else {
    	WordPart +=c;
    }
    
  for (int j =0; j<numberPart.length();j++) {
      int digit = Character.getNumericValue(numberPart.charAt(j));

	  if(digit>largestDigit) {
		  largestDigit = digit;
		  
	  }

  }
}


// Convert the number part to an integer
//int number = Integer.parseInt(numberPart);
String Word = WordPart.toString();
System.out.println("Largest number: " + largestDigit);
System.out.println("Word : " + Word);


}
}
