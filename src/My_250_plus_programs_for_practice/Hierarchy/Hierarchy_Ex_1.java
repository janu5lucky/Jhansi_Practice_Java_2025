package My_250_plus_programs_for_practice.Hierarchy;

public class Hierarchy_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent obj = new child();
		obj.sms();

	}
	
}
class parent{
	
	public static void sms() {
 System.out.println("Print from Parent class");
 
	}
	
}

class child extends parent {
	
	public static void sms() {
		 System.out.println("Print from Child class");
		 
			}
	
}


