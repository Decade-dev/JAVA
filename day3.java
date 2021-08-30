import java.util.Scanner;
public class day3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner cin =  new Scanner (System.in);
		String[] a = new String [5];
		String b = "bb";
		boolean isflag = true;
		for(int i = 0; i < 5; i++)
		{
			a[i] = cin.next();
			if(b.equals(a[i]))//判断a[i]和b完全是否相等，返回boolean类型，类似c和c++中的strcmp；
			{
				isflag = false;
				System.out.println("恭喜你找到元素位置" + i);
				break;
			}
		}
		if(isflag)
		{
			System.out.println("很遗憾没找到");
		}
		//二分法 前提必须是有序的数组
		int[] c = new int[]{1,2,3,4,5,6,7,8,9,10};
		boolean flag = true;
		int head = 0;
		int end = c.length - 1;
		int e = 2;
		while(head <= end)
		{
			int middle = (head + end)/2;
			if(e == c[middle])
			{
				System.out.println("恭喜你找到数组元素的位置" + middle);
				flag = false;
				break;
			}
			else if(e > c[middle])
			{
				head = middle + 1;
			}
			else
			{
				end = middle - 1;
			}
		}
		if(flag)
		{
			System.out.println("很遗憾没找到");
		}
		//冒泡排序 从小到大依次排序
		int[] a = new int[]{7,5,3,2,1,6,8,9,10,4};
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length - i - 1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
