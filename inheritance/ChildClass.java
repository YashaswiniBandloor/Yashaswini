package inheritance;

class ParentClass
{
	static  void parent()
	{
		System.out.println("parent");
	}
}
public class ChildClass extends ParentClass
{
     static void child(){
	{
		System.out.println("child");
	}
}
	public static void main(String[] args) 
	{
		
		child();
		parent();
		
	}

}
