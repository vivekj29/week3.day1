package week3.day1assignments;

public class StringEquals {
	
	
	public static void main(String[] args) {
		String s1= "I am Learning Java";
		String s2= "I am learning java";
		
		/*
		 * if(s1==s2) { System.out.println("Both the strings are equal"); } else {
		 * System.out.println("Both the strings are NOT equal"); }
		 */

		/*
		 * if(s1.equals(s2)) { System.out.println("Both the strings are equal"); } else
		 * { System.out.println("Both the strings are NOT equal"); }
		 */
	
		
		  if(s1.equalsIgnoreCase(s2)) { System.out.println("Both the strings are equal"); } else {
		  System.out.println("Both the strings are NOT equal"); }
		 
}
}
