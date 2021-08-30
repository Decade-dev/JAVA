public class day10//单例设计模式  代码块
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		Account account1 = Account.getInstance();
		Account account2 = Account.getInstance();
		System.out.println(bank1 == bank2);
		System.out.println(account1 == account2);
		System.out.println("*************************************");
		Person p = new Person();//执行顺序为；静态代码块>代码块>构造器
	}
}
class Bank//饿汉式
{
	private Bank()
	{

	}
	private static Bank instance = new Bank();
	public static Bank getInstance()
	{
		return instance;
	}
}
class Account//懒汉式
{
	private Account()
	{
	}
	private static Account instance = null;
	public static Account getInstance()
	{
		if(instance == null)
		{
			instance = new Account();
		}
		return instance;
	}
}
class Person
{
	private String name;
	private int age;
	private static int weight;
	Person()
	{
		name = "林燊燊";
		age = 19;
		System.out.println("name = " + name + " age = " + age);
	}
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	static
	{
		weight = 70;
		System.out.println("weight = " + weight);
		System.out.println("静态代码块的执行");
	}
	{
		System.out.println("代码块的执行");
	}
}
