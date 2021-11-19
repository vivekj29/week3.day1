package week3.day1assignments;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("The axis bank minimum balance is INR 5000");
	}
	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
