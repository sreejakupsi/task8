package task7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Question4 {

	public static void main(String[] args) {
	//Error handling
	try {	
		FileReader filer= new FileReader("Test.txt");
		System.out.println(filer);
	}catch(FileNotFoundException e) {
		System.out.println("File not found");
	}
	//Rest of the code 
	System.out.println("Rest of the code will be displayed");

	}

}
