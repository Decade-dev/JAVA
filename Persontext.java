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
		System.out.println("���ù�����");
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
		System.out.println("�Է�");
	}
}
class Teacher extends Person
{
	public void teach()
	{
		System.out.println("����");
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
