package My_250_plus_programs_for_practice.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Write_to_file_Ex_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateNew_file_Ex_001 newfile = new CreateNew_file_Ex_001();
	newfile.main(args);
		creating_new_file();
		write_to_file_appoach1();
		write_to_file_appoach2();
	}

	public static void creating_new_file() {
		
		try {
			File file = new File("D:\\seleniumfiles\\newfile.txt");
			if(file.createNewFile()){
				System.out.println("New File created : "+file.getName());
			}else {
				System.out.println("Already exists");
			}
			
		}catch(Exception e) {
			System.out.println("Got some error");
			e.printStackTrace();
		}
	}
	
	public static void write_to_file_appoach1() {
	try(FileWriter writer = new FileWriter("D:\\seleniumfiles\\Example.txt")){
			
			writer.write("Hello! This write to file ");
			System.out.println("wrote string to file sucessfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void write_to_file_appoach2() {
		try(BufferedWriter bw = new BufferedWriter (new FileWriter("D:\\seleniumfiles\\newfile.txt"))){
				
				bw.write("Hello! This write to file using buffered writer Line 1 ");
				bw.newLine();
				bw.write("Hello! This write to file using buffered writer Line 2 ");

				System.out.println("wrote string to file sucessfully");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}
	
}
