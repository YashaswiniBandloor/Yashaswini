package inheritance;

public class City_Class extends State_Class
{
 static  void add()
 {
	 System.out.println("adding");
 }
 void sub()
 {
	 System.out.println("substration");
 }
	public static void main(String[] args) 
	{
		add();
		mul();
		City_Class c1 =new City_Class();
		c1.sub();
		c1.divide();
	}

}
class State_Class
{
	static void mul()
	{
		System.out.println("mul");
	}
	void divide()
	{
		System.out.println("divide");
	}
}