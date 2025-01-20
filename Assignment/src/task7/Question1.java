package task7;

public class Question1 {

	public static void main(String[] args) {
		//Intializing the number
		int num1=10;
		int num2=0;
		//Error handling 
		try {
			int result=num1/num2;
			System.out.println(result);
		}
		//Arithmetic exception handling
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception has occured");
		}
		System.out.println("Rest of the code will be displayed");

	}

}

