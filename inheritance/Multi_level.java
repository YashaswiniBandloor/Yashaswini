package inheritance;

class GrandParentClass
{
	static void fetching_username() 
	{
		System.out.println();
	}
	
}
class Parent_Class1 extends GrandParentClass
{
	static void login_using_UN()
	{
		
	}
}

public class Multi_level extends Parent_Class1 
{
	static void  testcase_addingcart()
	{
		
	}
	public static void main(String[] args) 
	{
		fetching_username();
		testcase_addingcart();
		login_using_UN();
	}

}
