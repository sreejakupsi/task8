package task7;

public class Question3 {
	//Generic Exception
	public static void checkAge(int age) throws Exception {
		//Condition to check the age
		if(age<18) {
			throw new Exception("InvalidAgeException");
		}
		else {
			System.out.println("Valid age");
		}
	}
	//InvalidAgeException
	public static void main(String[] args) {
		try {
			checkAge(12);
		}catch(Exception e) {
			System.out.println("Invalid Age Exception");
		}
		System.out.println("Rest of the code");
		
	}

}







