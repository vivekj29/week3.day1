package week3.day1assignments;

public class Students {
	
	public void getStudentInfo(int Studentid) {
		System.out.println("Student ID: "+ Studentid);
		
	}
	
	public void getStudentInfo(int Studentid, String name) {
		System.out.println("Student ID: " + Studentid + " ; Student name: " + name);
		
	}
	
	public void getStudentInfo(String email, long phnno) {
		System.out.println("Student email: " + email + " ; Phone number: " + phnno);
		
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(1001);
		stud.getStudentInfo(1001, "Rithvik");
		stud.getStudentInfo("testmail29@gmail.com", 9840198401l);
	}

}
