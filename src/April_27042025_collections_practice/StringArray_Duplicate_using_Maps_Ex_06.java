package April_27042025_collections_practice;

import java.util.HashMap;

public class StringArray_Duplicate_using_Maps_Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbbbcccdddde";
		int l = str.length();
		int count =1;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0;i<l;i++) {
		//	for(int j =i+1;j<l-1;j++) {
			char c = str.charAt(i);
				if(map.containsKey(c))
				{
					count = map.get(c);
					count++;
					map.put(c, count);
					
				}else {
					map.put(c,1);
				}
				
			//}
		}for (Character key: map.keySet()) {
			System.out.print(key+" - "+map.get(key)+", ");
		}
		

	}

}
