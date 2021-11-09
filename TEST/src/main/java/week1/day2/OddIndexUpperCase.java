package week1.day2;

public class OddIndexUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		char arr[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		if(i%2!=0)
 System.out.print(Character.toUpperCase(arr[i]));
		else
			System.out.print(arr[i]);
		
	}
		

}
}