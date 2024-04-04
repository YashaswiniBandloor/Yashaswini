package inheritance;
class GrandParent_class
{
	GrandParent_class()
	{
		System.out.println("3");
	}
}
class Parent_classs extends GrandParent_class
{
	Parent_classs(int a,double b)
	{
		System.out.println("2");
	}
}
class Child_class extends Parent_classs
{
	Child_class()
	{
		super(45,52.5);
		System.out.println("1");
	}
}
public class myClass 
{
	public static void main(String[] args)
	{
		
	Child_class c1 = new Child_class();
	}
}
