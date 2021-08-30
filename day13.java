public class day13 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p = new Person();
		Person.Man man = p.new Man();
		man.display("人上人");
		Person.Woman woman = new Person.Woman();
		woman.display("人上人");
	}
}
class Person
{
	String name = "人";
	class Man
	{
		String name = "男人";
		void display(String name)
		{
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Person.this.name);
		}
	}
	static class Woman
	{
		String name = "女人";
		void display(String name)
		{
			System.out.println(name);
			System.out.println(this.name);
			//因为静态类先加载所以调用不了非静态非本类的属性和方法System.out.println(Person.this.name);
		}
	}
}