package task7;

public class Question2 {

	public static void main(String[] args) {
		//Intializing the array 
		String[]colour= {"Black","Blue","Green","Yellow","Violet"};
		//Error handling
		try {
		System.out.println(colour[5]);
		}
		//ArrayIndexOutOfBoundsException handling
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index value 5 is not availabe in the given string");
		}
		System.out.println("Rest of the code will be displayed");
		
		
		//Intializing the string
		String name="Happy day Positive vibe";
		//Error handling
		try {
		System.out.println(name.substring(5,24));
		}
		//StringIndexOutOfBoundsException handling
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception has occured");
		}
		System.out.println("Rest of the code will be displayed");
		
	}

}
