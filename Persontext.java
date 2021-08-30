public class Persontext
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Student student = new Student ();
		student.eat();
		student.study();
	}
}
class Person
{
	String name;
	int age;
	public Person()
	{
		System.out.println("调用构造器");
	}
	public Person(String name)
	{
		this();
		this.name = name;
	}
	public Person(String name,int age)
	{
		this(name);
		this.age = age;
	}
	public void eat()
	{
		System.out.println("吃饭");
	}
}
class Teacher extends Person
{
	public void teach()
	{
		System.out.println("教书");
	}
}
class Student extends Teacher
{
	public void study()
	{
		teach();
		System.out.println("study");
	}
}
