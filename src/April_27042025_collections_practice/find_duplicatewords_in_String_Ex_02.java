package April_27042025_collections_practice;

public class find_duplicatewords_in_String_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str =  "I am good in Java Java program";
		String[] words = str.split("");
		int count  =0;
		for(String word :words) {
			count =1;
			for(int i =1;i<words.length;i++){
				if(word.equals(words[i])) {
					count++;
					System.out.println(word+" "+count);
				}
				
			}
			
		}

	}

}
