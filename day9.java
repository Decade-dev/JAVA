public class day9//æ≤Ã¨∑Ω∑®∫Õæ≤Ã¨ Ù–‘
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Account a = new Account();
		a.print();
		Account b = new Account();
		b.print();
		Account.aaa();
	}
}
class Account
{
	private int id;
	private static int flag = 1000;
	private static int num = 0;
	Account()
	{
		id += flag++;
		num++;
	}
	public void print()
	{
		System.out.println("id = " + id + " num = " + num);
	}
	public static void aaa()
	{
		System.out.println("¥Ê«Æ");
	}
}
