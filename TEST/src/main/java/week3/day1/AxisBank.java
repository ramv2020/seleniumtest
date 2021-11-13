package week3.day1;

public class AxisBank extends BankInfo {
	public void fixed() {
		System.out.println("Interest for fixed is 8.5%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank ab = new AxisBank();
ab.fixed();
ab.deposit();
ab.saving();
	}

}
