package My_250_plus_programs_for_practice.Constructors;

public class Person extends super_person{

	String name ;
	int age ;
	
	
	Person(){
		name = "jhansi";
		age = 35;
		
		System.out.println("default constructor values : name = "+name+", age = " +age);
		
	}
	
	Person(String name, int age){
		
		this.name = name;
		this.age = age;
		
		System.out.println("parameterized constructor values : name = "+name+", age = " +age);

	}

Person(String name, int age,String city){
		
		super.name = name;
		super.age = age;
		super.city = city;
		
		System.out.println("parameterized super () constructor values : name = "+name+", age = " +age+", city : "+city);

	}

}
