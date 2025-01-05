package task;

import java.util.Scanner;

public class DigitsInAInteger {

	public static void main(String[] args) {
		Scanner digits=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=digits.nextInt();
		//convert integer to string because we cannot invoke toString() on the primitive type int
		String number=Integer.toString(Math.abs(num));
		int length=number.length();
		System.out.println(length);
		digits.close();
	}

}
