package task;

public class IfStatement {

	public static void main(String[] args) {
	//Declaring variables
	int a=105;
	int b=550;
	int c=200;
	int d=300;
	//Sum of a,b,c,d
	int sum1=a+b;
	int sum2=c+d;
	System.out.println("Sum of a and b is " + sum1);
	System.out.println("Sum of b and c is "+ sum2);
	//if condition to compare the sum of variables
	if((a+b)>(c+d)) {
		System.out.println("Sum of a + b is greater then c + d");
	}
	else {
		System.out.println("Sum of a + b is lesser then c + d");
	}

	}

}
