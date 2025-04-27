package april_240425_practice;

public class duplicatechar_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "indian";
		int l = str.length();
		int count;
		for(int i = 0;i<l;i++) {
			count =1;
			for(int j =i+1;j<l;j++) {
				char c = str.charAt(i);
				char s = str.charAt(j);
				
				if(c==s) {
					count++;
					System.out.print(c+""+count);
				}
				
			}
			
			
		}
		
		
	}

}
