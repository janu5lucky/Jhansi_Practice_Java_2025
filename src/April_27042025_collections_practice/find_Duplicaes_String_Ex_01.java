package April_27042025_collections_practice;

public class find_Duplicaes_String_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "karthika";
		int l =str.length();
		int count=0;
		for(int i=0;i<l;i++){
			char c = str.charAt(i);
			count =1;
			for(int j=i+1;j<l;j++) {
				char s =str.charAt(j);
				
				if(c==s) {
					count++;
					System.out.println(c+""+count);
					
				}
				
			}
			
			
		}System.out.println();
		
		
	}

}
