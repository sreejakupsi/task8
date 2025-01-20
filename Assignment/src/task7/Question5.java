package task7;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {
		//Creating Arraylist of string
		ArrayList<String>flowers=new ArrayList<>();
		//Adding the items
		flowers.add("Rose");
		flowers.add("Lotus");
		flowers.add("Lily");
		flowers.add("Jasmin");
		flowers.add("Sunflower");
		System.out.println("List of items in arrayList:"+flowers);
		
		//Removing individual items
		flowers.remove(2);
		System.out.println("List of items in arrayList after remove method:"+flowers);
		
		//Removing all the elements
		flowers.removeAll(flowers);
		System.out.println("List of items in arrayList after removeAll method:"+flowers);
	}

}
