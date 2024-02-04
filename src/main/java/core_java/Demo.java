package core_java;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Shumson Nahar\\Desktop\\abc.txt");
		if(file.exists()) {
			System.out.println("The file exists at the provided path");
				
			
		}else {
			System.out.println("The file is not available at the provided path"); 
			
		}

	}

}
