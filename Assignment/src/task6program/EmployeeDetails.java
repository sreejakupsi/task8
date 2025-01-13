package task6program;

public class EmployeeDetails {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	//Constructor
	public EmployeeDetails(int id,String firstName,String lastName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	//method to calculate the salary
	public int getAnnualSalary() {
		return salary*12;
	}
	//method to calculate the raise in salary
	public void raisedSalary(int percentage) {
		salary= salary+(salary*percentage/100);
	}
	//Getter
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getSalary() {
		return salary;
	}
	//Setter for salary
	public void setSalary(int salary) {
		this.salary=salary;
	}
	//toString method for representing in string
	public String toString() {
		return "Employee[ID:"+id+" "+ "FirstName: "+firstName+" "+"LastName: "+lastName+" "+"Salary: "+salary+"]";
		
	}
	public static void main(String[] args) {
	//Creating object for employes
		EmployeeDetails objEmp=new EmployeeDetails(01, "Sreeja", "Kumar",30000);
		//Initial details:
		System.out.println(objEmp.toString());
		
		//Annual Salary
		System.out.println("Annual Salary:" + objEmp.getAnnualSalary());
		
		//Raise Salary
		objEmp.raisedSalary(10);
		
		//Updated Details:
		System.out.println("Details after raise in salary:"+ objEmp.toString());
		System.out.println("Annual Salary after raise:"+objEmp.getAnnualSalary());
	}

}
