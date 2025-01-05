package task;

public class SwappingNumbers {

	public static void main(String[] args) {
	//Without additional variable
	int a=100,b=300;
	System.out.println("Values before swap a: "+ a +","+ "b: "+b);
	a=a+b;//400
	b=a-b;//100
	a=a-b;//300
	System.out.println("Values after swap a: "+ a +", "+ "b: "+b);
	
	//With additional variable
	int c=100,d=300;
	System.out.println("Values before swap c: "+ c +","+ "d: "+d);
	int temp=c;
	c=d;
	d=temp;
	System.out.println("Values after swap c: "+ c +","+ "d: "+d);
	}
}
