package My_250_plus_programs_for_practice.Constructors;

public class car {
	
	String brand ;
	int year;
	String model;
	
	
	car(){
		
		this("suzuki", 2022, "Swift");
		
		System.out.println("default constructor values : car brand: "+brand+", year = " +year+", model : "+model);

		
	}
	
	car(String brand, int year,	String model){
		
		this.brand = brand;
		this.year = year;
		this.model = model;
		System.out.println("Parametrized constructor values : car brand: "+brand+", year = " +year+", model : "+model);
	
		
	}
	
}
