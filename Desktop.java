package week3.day1assignments;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Print the desktop size");

	}
	
	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();
	}
}
