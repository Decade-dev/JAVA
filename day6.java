public class day6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		day6 d = new day6();
		d.func(new Student());
	}
	public void func(Person p)
	{
		p.study();
		if(p instanceof Graduate)
		{
			System.out.println("毕业");
		}
		if(p instanceof Student)
		{
			System.out.println("学生");
		}
		if(p instanceof Person)
		{
			System.out.println("人");
		}
	}
}
class Person
{
	public void study()
	{
		System.out.println("学的不好");
	}
}
class Student extends Person
{
	public void study()
	{
		System.out.println("学的还行");
	}
}
class Graduate extends Student
{
	public void study()
	{
		System.out.println("学的好");
	}
}