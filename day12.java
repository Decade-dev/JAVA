public class day12 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Man man = new Man("ÁÖŸöŸö",19,175);
		man.run();
		man.swim();
		man.sleep();
		man.print();
	}
}
interface Run
{
	public static final int speed = 1;
	public abstract void run();
}
interface Swim
{
	public abstract void swim();
}
interface Sleep
{
	public abstract void sleep();
}
class Person 
{
	 String name;
	 int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

}

class Man extends Person implements Run,Swim,Sleep
{
	private int height;
	Man(String name,int age,int height)
	{
		super(name,age);
		this.height = height;
	}
	public void print()
	{
		System.out.println("name = " + name + " age = " + age + " height = " + height);
	}
	public void run()
	{
		System.out.println("ÅÜ²½");
	}
	public void swim()
	{
		System.out.println("ÓÎÓ¾");
	}
    public void sleep()
	{
		System.out.println("Ë¯¾õ");
	}
}