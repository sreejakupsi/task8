package task;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
	Scanner primeOrNot=new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=primeOrNot.nextInt();
	//introducing new method
	if(isPrime(number)) {  //reads prime number
		System.out.println(number+" is a prime number");
	}
	else {  //reads numbers which are not prime
		System.out.println(number+" is not a prime number");
	}
	primeOrNot.close();
	} 
	private static boolean isPrime(int number) {
	if(number<=1) { //not prime number
		return false;
	}
	for(int i=2; i<=Math.sqrt(number);i++) {   //not prime number
		if(number%i==0) {
			return false;
		}
	}
	return true;//prime number
	}
}
