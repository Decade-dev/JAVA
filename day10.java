public class day10//�������ģʽ  �����
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
		Person p = new Person();//ִ��˳��Ϊ����̬�����>�����>������
	}
}
class Bank//����ʽ
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
class Account//����ʽ
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
		name = "�֟���";
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
		System.out.println("��̬������ִ��");
	}
	{
		System.out.println("������ִ��");
	}
}
