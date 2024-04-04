package exception;

import java.util.Arrays;

public class ArrayException {

	public static void main(String[] args) 
	{
		try
		{
		int number[] =new int [4];
		number[0]=90;
		number[1]=40;
		number[2]=78;
		number[3]=56;
		number[4]=70;
				 System.out.println(Arrays.toString(number));
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("handled the exception of AE");
		}
	}

}
