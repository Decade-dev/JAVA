import java.util.Scanner;
public class day2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello day2!");
		Scanner cin = new Scanner (System.in);
		String name = cin.next();
		char n = name.charAt(0);//提取字符串中第0位字符；
		System.out.println(n);
		int flag = cin.nextInt();
		switch(flag)
		{
			case 1:
				System.out.println("one");
					break;
			case 2:
				System.out.println("two");
					break;
			case 3:
				System.out.println("three");
					break;
			default:
				System.out.println("other");
					break;
		}
		String names [] = new String [5];
		names[0] = "儿子";
		names[1] = "孙子";
		names[2] = "龟孙子";
		names[3] = "龟儿子";
		names[4] = "神龟子";
		for(int i = 0; i < 5; i++)
		{
			System.out.println(names[i]);
		}
		int[][] nn = new int [3][3];
		int[][] nnn = new int[][]{{1,2,3},{1,2,3},{1,2,3}};
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				nn[i][j] = cin.nextInt();
			}
		}
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(nn[i][j] + " ");
				System.out.print(nnn[i][j] + " ");
			}
			System.out.println();
		}
		String [] nnnn = new String []{"a","b","c","d","e","f"};
		String [] nnnnn = new String [6];
		for(int i = 0; i < nnnn.length; i++)
		{
			nnnnn[i] = nnnn[i];
		}
		for(int i = 0; i < nnnn.length / 2; i++)
		{
			String temp = nnnn[nnnn.length-1];
			nnnn[nnnn.length-1-i] = nnnn[i];
			nnnn[i] = temp;
		}
		for(int i = 0; i < nnnn.length; i++)
		{
			System.out.print(nnnn[i] + " ");
			System.out.print(nnnnn[i] + " ");
			System.out.println();
		}
	}
}
