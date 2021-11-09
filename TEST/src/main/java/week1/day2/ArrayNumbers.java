package week1.day2;

import java.util.Arrays;

public class ArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {100,49,398,34,267};
int lenArray = array.length;
for(int i =0;i<lenArray;i++)
{
	System.out.println("the elements of the array at position ["+i+"]:" + array[i]);
}

System.out.println("***************");

	Arrays.sort(array);
	System.out.println("Sorted Array:");
	for(int i =0;i<lenArray;i++)
	{
		System.out.println("the elements of the array at position ["+i+"]:" + array[i]);
	}
	System.out.println("Second largest element" + array[lenArray-2]);
	System.out.println("Second smallest element" + array[1]);
	}

}
