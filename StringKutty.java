package week3.day1assignments;

public class StringKutty {

	public static void main(String[] args) {

		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");

		/*
		 * When we create a String object using the new() operator, it always creates a
		 * new object in heap memory. On the other hand, if we create an object using
		 * String literal syntax e.g. “Kutty”, it may return an existing object from the
		 * String pool, if it already exists.
		 */

	}
}
