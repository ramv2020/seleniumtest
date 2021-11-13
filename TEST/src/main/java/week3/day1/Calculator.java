package week3.day1;

public class Calculator {

	public void TwoNumbers(int num1,int num2)
	{
		int sum = num1+num2;
		System.out.println("Sum of two numbers: "+ sum);
	}
	public void ThreeNumbers(int num1,int num2,int num3)
	{
		int sum = num1+num2+num3;
		System.out.println("Sum of three numbers: "+ sum);
	}

		public void Difference(int num1,int num2)
		{
			int diff = num1-num2;
			System.out.println("Difference of two numbers: "+ diff);
		}
		public void DiffDataType(double num1, double num2)
		{
			double diff = (num1 - num2);
			System.out.println("Difference: "+ diff);
		}
		public void Multiply(int num1,int num2)
		{
			int product = num1*num2;
			System.out.println("Multiplication of two numbers: "+ product);
		}
		public void Diff(int num1, double num2)
		{
			double product = (num1 *num2);
			System.out.println("Difference: "+ product);
		}
		public void Division(int num1,int num2)
		{
			int q = num1/num2;
			System.out.println("Division of two numbers: "+ q);
		}
		public void Division(int num1, double num2)
		{
			double q = (num1 / num2);
			System.out.println("Division: "+ q);
		}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator obj = new Calculator();
obj.TwoNumbers(60, 70);
obj.ThreeNumbers(30,40,50);
obj.DiffDataType(60, 500);
obj.Difference(50, 30);
obj.Multiply(40, 20);
obj.Diff(60,5000);
obj.Division(500, 100);
obj.Division(70, 300);

	}

}
