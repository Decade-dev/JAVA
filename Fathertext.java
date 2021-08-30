public class Fathertext 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Son son = new Son();
		son.Getmessage();
	}
}
class Father
{
	String name = "爸爸";
	public void Getname()
	{
		System.out.println("爸爸");
	}
}
class Son extends Father
{
	String name = "儿子";
	public void Getname()
	{
		System.out.println("儿子");
	}
	public void Getmessage()
	{
		System.out.println(super.name);//super在子类中调用子类与父类同名同类型的属性
		super.Getname();//super在子类中调用父类被重写的方法
	}
}