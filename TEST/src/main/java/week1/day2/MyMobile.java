package week1.day2;

public class MyMobile {

	String IMEI = "1234567897654";
	String Brand;
	int cost;
	int pixel;
	
	public void makeCall() {
		System.out.println("can make calls");

	}
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("can send messages");
	}
private void payBills() {
	// TODO Auto-generated method stub
	System.out.println("can pay bills");
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
MyMobile samsung = new MyMobile();
samsung.payBills(); 
samsung.sendMsg();
samsung.makeCall();
System.out.println("samsung " + samsung.IMEI);
System.out.println("cost "+ samsung.cost);
}
}
