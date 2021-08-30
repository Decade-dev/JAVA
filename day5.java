public class day5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");//多态性
		Person p1 = new Man();
		Person p2 = new Woman();
		p1.Gender();
		p1.eat();
		p1.walk();
		System.out.println("**************************");
		p2.Gender();
		p2.eat();
		p2.walk();

	}
}
class Person
{
	public void Gender()
	{
	}
	public void eat()
	{
		System.out.println("吃饭");
	}
	public void walk()
	{
		System.out.println("走路");
	}
}
class Man extends Person
{
	public void Gender()
	{
		System.out.println("男");
	}
	public void eat()
	{
		System.out.println("多吃饭");
	}
	public void walk()
	{
		System.out.println("霸气走路");
	}
}
class Woman extends Person
{
	public void Gender()
	{
		System.out.println("女");
	}
	public void eat()
	{
		System.out.println("少吃饭");
	}
	public void walk()
	{
		System.out.println("窈窕走路");
	}
}

