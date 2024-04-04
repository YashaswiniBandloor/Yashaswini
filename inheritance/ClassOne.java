package inheritance;
 interface Three
 {
	 void method3();
	 void method4();
	 
 }
 abstract class classtwo implements Three
 {
	abstract void method1();
	abstract void method2();
	 static void add()
	 {
		 
	 }
 }



public class ClassOne extends classtwo
{

	public static void main(String[] args)
	{
		

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}

	
}
