package April_27042025_collections_practice;

import java.util.*;

public class String_Duplicate_using_Maps_Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi am am java java program";
		int count =1;
		String[] strarr = str.split(" ");
		int l = strarr.length;

		HashMap<String, Integer> map = new HashMap<>();
		for(int i =0;i<l;i++) {
			String s = strarr[i];
				if(map.containsKey(s))
				{
					count = map.get(s);
					count++;
					map.put(s, count);
					
				}else {
					map.put(s,1);
				}
				
			//}
		}for (String key: map.keySet()) {
			if(map.get(key)>1)
			System.out.print(key+" - "+map.get(key)+", ");
		}
		

	}

}
