public class day5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");//��̬��
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
		System.out.println("�Է�");
	}
	public void walk()
	{
		System.out.println("��·");
	}
}
class Man extends Person
{
	public void Gender()
	{
		System.out.println("��");
	}
	public void eat()
	{
		System.out.println("��Է�");
	}
	public void walk()
	{
		System.out.println("������·");
	}
}
class Woman extends Person
{
	public void Gender()
	{
		System.out.println("Ů");
	}
	public void eat()
	{
		System.out.println("�ٳԷ�");
	}
	public void walk()
	{
		System.out.println("����·");
	}
}

