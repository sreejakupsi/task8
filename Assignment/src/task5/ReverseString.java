package task5;

public class ReverseString {

	public static void main(String[] args) {
		String a="Sreeja";
		System.out.println("Original value: "+a);
		//returs the reversed string
		String reversed="";
		for(int i=a.length()-1;i>=0;i--) {
			reversed+=a.charAt(i);
		}
		System.out.println("Reversed value: "+ reversed);
	}
	}

	