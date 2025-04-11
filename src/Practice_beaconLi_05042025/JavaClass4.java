package Practice_beaconLi_05042025;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaClass4 {

	public static void main(String[] args) {
		
		String[][] list = {
                {"name:john", "age:25"},
                {"name:Alice", "age:16"},
                {"name:bob", "age:30"},
                {"name:Kareem", "age:32"}

        };

        ArrayList<String[]> filteredList = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            String ageStr = list[i][1].split(":")[1]; // Get "25", "16", etc.
            int age = Integer.parseInt(ageStr);

            if (age > 18) {
                filteredList.add(list[i]);
            }
        }

        // Print filtered result
        System.out.println("People with age > 18:");
        for (String[] person : filteredList) {
            System.out.println(Arrays.toString(person));
        }
		// TODO Auto-generated method stub

	}

}
