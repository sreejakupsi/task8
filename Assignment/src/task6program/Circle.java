package task6program;

public class Circle {
	
	private int radius;
	//constructor
	public Circle(int radius) {
		this.radius=radius;
	}
	//returns circumference
	public double circumference() {
		return 2*Math.PI*radius;
	}
	//Calculates the radius and circumference of the circle
	public static void main(String[] args) {
		Circle objCircle=new Circle(50);
		System.out.println("Radius of the circle: "+ objCircle.radius);
		System.out.println("Circumference of the circle: "+ objCircle.circumference());
	}

}
