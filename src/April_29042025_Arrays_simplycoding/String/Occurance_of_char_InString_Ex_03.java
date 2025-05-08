package April_29042025_Arrays_simplycoding.String;

import java.util.HashMap;
import java.util.Map;

public class Occurance_of_char_InString_Ex_03 {

		public static void main(String[] args) {

			String str = "aaabbcceed";
		    int l = str.length();
		    Map<Character, Integer> map = new HashMap<>();
		    int count =0;
		    
		    for(char c : str.toCharArray()){
		        if(map.containsKey(c)){
		            count = map.get(c);
		            count++;
		            map.put(c,count);
		        }else{
		            map.put(c,1);
		        }
		        
		    }
		    for(Character key: map.keySet()){
		        System.out.print(key+" - "+map.get(key)+", ");
		        
		    }
		    


			}
		}