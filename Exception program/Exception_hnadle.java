package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_hnadle {

	public static void main(String[] args)
	{
		try {
			Scanner s1 = new Scanner(System.in);
			
		int c=1/s1.nextInt() ;
		System.out.println("try block");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("handled the exception of AE");
		}
		catch(NullPointerException a2)
		{
			System.out.println("handled the exception of NP");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("handled the exception IM");
		}
		
		catch(ArrayIndexOutOfBoundsException a4)
		{
			System.out.println("handled the exception AI");
		}
		finally {
			System.out.println("here you can hve some common message");
		}

	}

}
