package task7;

import java.util.TreeMap;

public class Question6 {

	public static void main(String[] args) {
		// Creating TreeMap of employees
		TreeMap<Integer,String>employeeDetails=new TreeMap<>();
		
		//Adding employe id and employe name
		//TreeMap display items in accending order by default but only the keys are displayed in accending order by default but not the values
		employeeDetails.put(101, "Sam");
		employeeDetails.put(105, "Deepana");
		employeeDetails.put(103, "Aakash");
		employeeDetails.put(104, "Ved");
		employeeDetails.put(106, "Munna");
		employeeDetails.put(102, "Lisha");
		
		System.out.println("Employee Details:"+employeeDetails);
		
		//Printing employee name in accending order
		System.out.println("Employee name in accending order:");
		//The stream() method is called on the collection returned by values().A Stream is a sequence of elements that can be processed in parallel or sequentially.
		//sorted method is used to return elements in the natural order
		//forEach() is terminal operation on the Stream, which consumes the elements of the stream one by one.
		employeeDetails.values().stream().sorted().forEach(System.out::println);
	}

}
