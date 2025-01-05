package task;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {	
		//to find odd or even number
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=num.nextInt();
		//reads if even
		if(number%2==0) {
			System.out.println(number+" "+"is a even number");
		}
		//reads if odd
		else {
			System.out.println(number+" "+"is a odd number");
		}
		num.close();
	}

}
