package May_030525_practice.Strings;

public class duplicate_inString_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbccddffe";
		int l = str.length();
		int count;
		for(int i = 0;i<l;i++) {
			count=1;
			char c = str.charAt(i);
			for(int j=i+1;j<l-1;j++) {
				char s = str.charAt(j);
				if(c==s) {
					count++;
					System.out.println(c+" - "+count);	
				}
			}
			
		}
		
		
	}

}
