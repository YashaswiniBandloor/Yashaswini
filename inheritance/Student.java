package inheritance;
class Mentor
{
	Mentor(int a)
	{
		//implicitly super calling statment
		System.out.println("mentor");
	}
}
public class Student extends Mentor 
{
	Student()
	{
		super(20);//explicitly super calling
		System.out.println("Student");
	}
	
public static void main(String[] args) 
{
	Student s1 = new Student();
	
}
}
