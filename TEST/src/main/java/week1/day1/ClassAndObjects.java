package week1.day1;

public class ClassAndObjects {
	
String ObjectCategory = "Mobile Phone";
String model;
long cost;
int weight;
boolean isTouchScreen;

public void MakeCalls()
{
	System.out.println("make calls");
}
public void ViewPhotos()
{
System.out.println("view the photos");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassAndObjects samsung = new ClassAndObjects();
samsung.cost=60000;
System.out.println("cost " + samsung.cost);
samsung.isTouchScreen=true;
System.out.println("Is touch enabled " + samsung.isTouchScreen);
samsung.MakeCalls();
samsung.ViewPhotos();
	}
}


