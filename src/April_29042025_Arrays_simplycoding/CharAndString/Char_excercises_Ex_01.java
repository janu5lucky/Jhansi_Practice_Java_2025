package April_29042025_Arrays_simplycoding.CharAndString;

public class Char_excercises_Ex_01 {

	public static void main(String[] args) {

		//chartoAscii();
		//asciitochar();
	//	methodbooleans();
		//Uppercase_to_lowercase();
		//lowercase_to_uppercase();
		//Arthematic_operations();
		//Escape_sequences();
		//Character_class();		
	//	Character_ToMethods();
		Interview_Questions_on_returnType();
		
	}



	public static void chartoAscii() {
		
		char c = 'a';
		char u = Character.toUpperCase(c);
		System.out.println(c);

		int ascii = (int) c;
		System.out.println("samll a ascii: "+ascii);
		ascii = (int) u;
		System.out.println("Upper Case A Ascii: "+ascii);

		
	}
	
public static void asciitochar() {
		// unicode : 0-65536 (2^16)
	int n = 87 ;
	char c = (char) n;
	System.out.println("integer to 87 char value : "+c);

		
	}
public static void methodbooleans() {
	// unicode : 0-65536 (2^16)
int n = 87 ;
int s = 87 ;

char c = (char) n;
System.out.println(Character.isAlphabetic(c));
System.out.println(Character.isLetter('7'));
System.out.println(Character.isLetter('\n'));

System.out.println(Character.isAlphabetic(s));
System.out.println(Character.isLowerCase(s));
System.out.println(Character.isUpperCase(s));

	
}
public static void methodbooleanscpaces() {
	// unicode : 0-65536 (2^16)
int n = 87 ;
int s = 87 ;

char c = (char) n;
System.out.println(Character.isWhitespace(c));
System.out.println(Character.isLetter(n));
System.out.println(Character.isAlphabetic(s));
System.out.println(Character.isLowerCase(s));
System.out.println(Character.isUpperCase(s));
System.out.println(Character.isWhitespace('\n'));


}
public static void Uppercase_to_lowercase() {
	// unicode : 0-65536 (2^16)
int n = 87 ;
int s = 87+32 ;

char c = (char) n;
char ch = (char) s;

System.out.println("Original case 87 : "+c);
System.out.println("+32 modified (to Lower)case 87 : "+ch);

}
public static void lowercase_to_uppercase() {
	// unicode : 0-65536 (2^16)
int n = 108 ;
int s = 108-32 ;

char c = (char) n;
char ch = (char) s;

System.out.println("Original case 108 : "+c);
System.out.println("-32 modified (to upper) case 108 : "+ch);

}

public static void Arthematic_operations() {
	// unicode : 0-65536 (2^16)


char ch = 'A';
System.out.println("ch: "+ch);

ch++;
System.out.println("ch++: "+ch);

}

public static void Escape_sequences() {
	// unicode : 0-65536 (2^16)


System.out.println("tab :'\t' ");
System.out.println("backspace a:'\b' ");
System.out.print("new line a:'\n' ");
System.out.println("carriage return :'\r' ");
System.out.println("form feed :'\f' ");
System.out.println("form feed :\'f\' ");
System.out.println("double quote :\"AS\" ");
System.out.println("single quote :\'f\' ");

}
public static void Character_class() {
// initialization
Character ch = new Character ('a');
System.out.println(ch);

Character ch1 = Character.valueOf('d');
System.out.println(ch1);
Character ch2 = 'm';
System.out.println(ch2);

}
public static void Character_ToMethods() {
	// initialization
	char ch = 'o';
	char ch1 = 'P';

	String str = Character.toString(ch);
	System.out.println("ToString :" +str);
	
	System.out.println("To Uppercase : "+Character.toUpperCase(ch));
	System.out.println("To lowerCase : " +Character.toLowerCase(ch1));

	}
public static void Interview_Questions_on_returnType() {

System.out.println(Character.isLetterOrDigit('7')); // boolean
System.out.println(Character.isUpperCase('c')); //boolean - return type
System.out.println(Character.toUpperCase('c')); // char - return type

System.out.println(Character.isWhitespace('\n')); //  /n throws error --- \n is nextline == whitespace
int x =7;  // x is char / int return type 
boolean y= Character.isLetter(x); // boolean - return type
System.out.println(y);


}

}
