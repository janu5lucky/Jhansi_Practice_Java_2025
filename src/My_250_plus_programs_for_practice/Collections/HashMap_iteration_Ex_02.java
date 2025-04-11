package My_250_plus_programs_for_practice.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_iteration_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> data = new HashMap<>();
		data.put(1, "one");
		data.put(2, "two");
		data.put(3, "three");
		data.put(4, "four");

		
		for(Entry<Integer , String > entry: data.entrySet()) {
			System.out.println("key : "+entry.getKey()+", Value : "+entry.getValue());
		}

	}

}
