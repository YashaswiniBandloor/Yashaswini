package exception;
public class Throw_Program 
{
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		
	//	throw new NullPointerException();
		
		Thread.sleep(2000);

		throw new NullPointerException("Sorry your file is empty");

		
	}

}
