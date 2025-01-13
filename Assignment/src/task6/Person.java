package task6;

public class Person {

	private String name;
	private int age;
	//Constructor
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//Getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		//Creating object
		Person objPerson=new Person("Sreeja",22);
		//Displaying the deails
		System.out.println(objPerson.name);
		System.out.println(objPerson.age);
	}

}
