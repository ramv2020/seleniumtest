package week3.day1;

public class Students {
public void getStudentInfo(int studentID) {
	System.out.println("Student Id is: "+studentID);
}
public void getStudentInfo(int studentID, String studentName) {
	System.out.println("Student name is: "+studentName +"  Student ID is: "+studentID );
}
public void getStudentInfo(String email, String phoneNum) {
	System.out.println("Student mail ID is "+email+"  student number is: "+phoneNum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std = new Students();
		std.getStudentInfo(101);
		std.getStudentInfo(102, "Ram");
		std.getStudentInfo("ram@test.com", "9876543211");

	}

}
