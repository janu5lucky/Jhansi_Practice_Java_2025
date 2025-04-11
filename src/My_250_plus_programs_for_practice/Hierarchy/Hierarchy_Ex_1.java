package My_250_plus_programs_for_practice.Hierarchy;

public class Hierarchy_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent obj = new child();
		obj.sms();
		obj.text();

	}
	
}
class parent{
	
	public static void sms() {
 System.out.println("Print from Parent class");
 
	}
	
	public String text() {
		
		String text = "Hello World from parent";
		 System.out.println(text);

		return text;
	}
	
}

class child extends parent {
	
	public static void sms() {
		 System.out.println("Print from Child class");
		 
			}
	
public String text() {
		
		String text = "Hi World from child";
		 System.out.println(text);

		return text;
	}
	
}


