package task5;

public class PrintThePattern {

	public static void main(String[] args) {
		//initialization
	int row=4;
	int number=1;
		//condition
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(number+ " ");
			number++;
		}
		System.out.println();
	}
	}

}
