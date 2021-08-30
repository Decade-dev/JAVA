public class day4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Animal animal = new Animal("小黄",18);
		System.out.println(animal.name + " " + animal.age);
	}
}
class Animal
{
	String name;
	int age;
	public Animal()
	{
		System.out.println("调用构造器");
	}
	public Animal(String name)
	{
		this();
		this.name = name;
	}
	public Animal(String name,int age)
	{
		this(name);
		this.age = age;
	}
}
