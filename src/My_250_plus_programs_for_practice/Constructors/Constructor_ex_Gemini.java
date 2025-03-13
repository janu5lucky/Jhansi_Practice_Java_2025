package My_250_plus_programs_for_practice.Constructors;

public class Constructor_ex_Gemini {
	
	public static void main(String[] args) {
        // Initializing an object using the constructor with parameters
        MyClass obj1 = new MyClass(10, "Hello");

        // Initializing an object using the default constructor
        MyClass obj2 = new MyClass();

        obj1.displayValues();
        obj2.displayValues();

    }
	

}
class MyClass {
    // Instance variables
    int value1;
    String value2;

    // Constructor (with parameters)
    public MyClass(int val1, String val2) {
        this.value1 = val1;
        this.value2 = val2;
    }

    // Constructor (without parameters - default constructor)
    public MyClass() {
        this.value1 = 0;
        this.value2 = "Default";
    }

    //Method to display values
    public void displayValues() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }
}
