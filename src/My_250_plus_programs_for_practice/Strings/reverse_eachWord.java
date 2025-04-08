package My_250_plus_programs_for_practice.Strings;

import java.util.Arrays;

public class reverse_eachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String txt="Tech Mahindra";
        String[] splitword = txt.split(" ");
        System.out.println(Arrays.toString(splitword));
        String rev = "";
        for(int i =0; i<splitword.length-1;i++){
            String word = splitword[i];
            for(int j=word.length()-1;j>=0;j--){
              
              rev = rev+word.charAt(j);   
                
                
            }
            
        }
        System.out.println("output :" +rev);

    }

}
