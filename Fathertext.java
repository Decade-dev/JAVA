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
	String name = "�ְ�";
	public void Getname()
	{
		System.out.println("�ְ�");
	}
}
class Son extends Father
{
	String name = "����";
	public void Getname()
	{
		System.out.println("����");
	}
	public void Getmessage()
	{
		System.out.println(super.name);//super�������е��������븸��ͬ��ͬ���͵�����
		super.Getname();//super�������е��ø��౻��д�ķ���
	}
}