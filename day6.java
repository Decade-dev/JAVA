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
			System.out.println("��ҵ");
		}
		if(p instanceof Student)
		{
			System.out.println("ѧ��");
		}
		if(p instanceof Person)
		{
			System.out.println("��");
		}
	}
}
class Person
{
	public void study()
	{
		System.out.println("ѧ�Ĳ���");
	}
}
class Student extends Person
{
	public void study()
	{
		System.out.println("ѧ�Ļ���");
	}
}
class Graduate extends Student
{
	public void study()
	{
		System.out.println("ѧ�ĺ�");
	}
}