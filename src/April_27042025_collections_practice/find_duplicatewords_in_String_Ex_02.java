package April_27042025_collections_practice;

import java.util.Arrays;

public class find_duplicatewords_in_String_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str =  "I am good in Java Java program";
		String[] words = str.split(" ");
		System.out.println("String arrays after split : "+Arrays.toString(words));
		int l = words.length;
		System.out.println(l);
		int count  =0;
		for(int i = 0;i<words.length;i++) {
			count =1;
			for(int j =i+1;j<words.length;j++){
				if(words[j].equals(words[i])) {
					count++;
					System.out.println(words[j]+" "+count);
				}
				
			}
			
		}

	}

}
