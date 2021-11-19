package week3.day1assignments;

public class ReplaceChar {

	public static void main(String[] args) {
		String s1 = "I am working with Java8";
		String s2 = s1.replace("8", "11");
		System.out.println("the new text is " +s2);
		String s3 = s2.concat("#");
		System.out.println("the appended text is " +s3);
		char[] charAt = s3.toCharArray();
        for (int i=4; i<= 13; i++) {
        	System.out.println(charAt[i]);
        }

	}

}
