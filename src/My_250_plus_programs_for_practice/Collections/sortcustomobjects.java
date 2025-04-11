package My_250_plus_programs_for_practice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Employee {
	int id;
	String name ;
	
Employee(int id, String name ){
	this.id =id;
	this.name = name ;
	
	
}
@Override
public String toString() {
	return "Employee{id = "+id+", name=' "+name+"'}";
}

}


public class sortcustomobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(3, "john"));
		employees.add(new Employee(1, "Alice"));
		employees.add(new Employee(4, "Babu"));
		employees.add(new Employee(2, "Sean"));

		
			
		
		Collections.sort(employees, new Comparator<Employee>(){
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.name.compareTo(e2.name);
			}
			
		});
System.out.println("Sorted Employees: "+employees);
	}

}
