package My_250_plus_programs_for_practice.Constructors;

public class super_person {
	
	String name;
	int age ;
	String city;
	
	
	super_person(){
		
	this("thakshika", 7);	
	System.out.println("Super class default constrcutor values : name : "+name+", age : " +age);

	}
	
	super_person(String name, int age ){
		
		this.name = name;
		this.age = age;
		System.out.println("Super class parameter constrcutor values : name : "+name+", age : " +age);

	}

super_person(String name, int age, String city ){
		
		this.name = name;
		this.age = age;
		this.city = city;
		
		System.out.println("Super class parameter constrcutor 2  values : name : "+name+", age : " +age+"and city :  "+city);

	}

	
}
