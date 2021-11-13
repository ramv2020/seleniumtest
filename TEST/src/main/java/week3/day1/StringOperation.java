package week3.day1;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("I am Learning Java");
		String str2 = new String("I am learning java");
		System.out.println("**Comparison using equal to operator**");
		if(str1==str2) {
			System.out.println("same text");
		}
		else
		{
		System.out.println(str1);
			System.out.println("diff text");
	}
		System.out.println("**Comparison using equals method**");	
	if(str1.equals(str2) ) {
		
	
	System.out.println("same text");
}
else
{
//System.out.println(str4);
	System.out.println("diff text");
}
	System.out.println("**Comparison using ignore case**");
	if(str1.equalsIgnoreCase(str2))
	{
		
		System.out.println("same text");
	}
	else
		System.out.println("diff text");
}}

