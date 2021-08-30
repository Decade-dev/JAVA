public class day11 //abstract类
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Man man = new Man("林燊燊",19,171);
		man.eat();
		Woman woman = new Woman("老刘",19,120);
		woman.eat();
	}
}
abstract class Person
{
	private String name;
	private int age;
	public abstract void eat();
	Person()
	{
		super();
	}
	Person(String name,int age)
	{
		this();
		this.name = name;
		this.age = age;
	}
}
class Man extends Person
{
	private int height;
	public void eat()
	{
		System.out.println("吃得多");
	}
	Man(String name,int age,int height)
	{
		super(name,age);
		this.height = height;
	}
}
class Woman extends Person
{
	private int weight;
	public void eat()
	{
		System.out.println("吃得少");
	}
	Woman(String name,int age,int weight)
	{
		super(name,age);
		this.weight = weight;
	}
}
