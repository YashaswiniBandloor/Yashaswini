package inheritance;

public class Example_1 
{
	String name;
	int age;
	double salary;
	void student_details(String name,int age,double salary)
	{
		System.out.println("i am "+name+" and my age is "+age+" and my salary is "+ salary);
		this.name= name;
		this.age =age;
		this.salary=salary;
	}
	public static void main(String[] args)
	{
		// calling the studentsdetails methods  by creating object
		Example_1 e1 = new Example_1();
		e1.student_details("yashu",25,80565);
		System.out.println(e1.name);//null
		System.out.println(e1.age);//0
		System.out.println(e1.salary);//0.0
		
		
	}

}
