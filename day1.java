import  java.util.Scanner;
class day2
{
	public static void main(String args [])
	{
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		double c = cin.nextDouble();
		String d = cin.next();
		if(a >= b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
		double value = Math.random();
		System.out.println(value);
		int max = (a > b) ? a : b;
		System.out.println(max);
	}
}