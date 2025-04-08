package My_250_plus_programs_for_practice.FileHandling;

import java.io.File;

public class CreateNew_file_Ex_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//public static CreateNew_file_Ex_001()
		try {
			File file = new File("D:\\seleniumfiles\\Example.txt");
			if (file.createNewFile()) {
				System.out.println("New File created sucessfully : "+file.getName());
			}else {
				System.out.println("File Already Exists");
	
			}
			
		}catch (Exception e) {
			System.out.println("Error Occured While Creating file ");
			e.printStackTrace();
		}
	
		
		}
		

}
