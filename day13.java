public class day13 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p = new Person();
		Person.Man man = p.new Man();
		man.display("������");
		Person.Woman woman = new Person.Woman();
		woman.display("������");
	}
}
class Person
{
	String name = "��";
	class Man
	{
		String name = "����";
		void display(String name)
		{
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Person.this.name);
		}
	}
	static class Woman
	{
		String name = "Ů��";
		void display(String name)
		{
			System.out.println(name);
			System.out.println(this.name);
			//��Ϊ��̬���ȼ������Ե��ò��˷Ǿ�̬�Ǳ�������Ժͷ���System.out.println(Person.this.name);
		}
	}
}