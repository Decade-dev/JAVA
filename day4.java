public class day4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Animal animal = new Animal("С��",18);
		System.out.println(animal.name + " " + animal.age);
	}
}
class Animal
{
	String name;
	int age;
	public Animal()
	{
		System.out.println("���ù�����");
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
