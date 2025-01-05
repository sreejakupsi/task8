package task;

import java.util.Scanner;

public class SeniorCitizenOrNot {

	public static void main(String[] args) {
	Scanner age=new Scanner(System.in);
	System.out.println("Enter your age");
	int a=age.nextInt();
	//reads senior citizen
	if(a<50) {
		System.out.println("Not a senior citizen ");
	}
	//reads non senior citizen
	else {
		System.out.println("Senior citizen");
	}
	age.close();
	}

}
