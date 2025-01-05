package task;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
	Scanner factorial=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=factorial.nextInt();
	long fact=1;
	//factorial is not defined for negative number
	if(n<0) {
		System.out.println("not defined");
	}
	else {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	factorial.close();
	}

}
