package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp()
	{
	
System.out.println("Phone is connected to WhatsApp");
	}
	
	public void takeVideo() {
		System.out.println("Smart Phone can take videos");
	}
	public static void main(String args[])
	{
		SmartPhone sp = new SmartPhone();
		sp.takeVideo();
	}

}
