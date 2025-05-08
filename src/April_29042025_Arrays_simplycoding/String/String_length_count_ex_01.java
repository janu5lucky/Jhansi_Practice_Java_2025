package April_29042025_Arrays_simplycoding.String;

public class String_length_count_ex_01 {
	
	
	public static void main(String[] args) {
		
	
	String str = "Hi i'm jhansi muthyala";
	int count =0;
	int countchar = 0;
	String ch = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
	
	int length = str.length();
	for(char c:str.toCharArray()) {
		
		count++;
		
	}
	
for(char c:ch.toCharArray()) {
		
		countchar++;
		
	}
System.out.println(count);
System.out.println(length);
System.out.println(countchar);

}
}