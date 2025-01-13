package task5;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner palindromOrNot= new Scanner(System.in);
		System.out.println("Enter the values to check palindrom or not");
		String value=palindromOrNot.nextLine();
		
		//removes the gap and replace to lower case
		String cleanValues=value.replaceAll("\\s+", "").toLowerCase();
		String reverseValue=new StringBuilder( cleanValues).reverse().toString();
		
		//checks the condition
		if(cleanValues.equals(reverseValue)) {
			System.out.println("The given value is a palindron");
		}
		else {
			System.out.println("The given value is not a palindrom");
		}
		palindromOrNot.close();
	}

}
