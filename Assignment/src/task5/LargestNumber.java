package task5;

public class LargestNumber {

	public static void main(String[] args) {
		//initilization
		int a=1200;
		int b=4000;
		int c=7900;
		
		//returns the largest number
		if(a>b && a>c) {
			System.out.println("a is the largerst number");
		}else if(b>a && b>c) {
			System.out.println("b is the largert number");
		}else {
			System.out.println("c is the largest number");
		}

	}

}
