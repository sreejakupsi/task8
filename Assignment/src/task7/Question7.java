package task7;

import java.util.ArrayList;

public class Question7 {

	public static void main(String[] args) {
	
		//Creating Arraylist of string
		ArrayList<String>days=new ArrayList<>();
		
		//Add items
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		System.out.println("Number of days in the arrayList:"+days);
		
		//length og the array
		int s=days.size();
		System.out.println("Size of the arrayList:"+s);
		
		//Convert list to array
		System.out.println("Converted array to list items:");
		String[]daysInArray=new String[s];
		days.toArray(daysInArray);
		
		for(String WeekDays:daysInArray) {
			System.out.println(WeekDays);
		}
	}

}
