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
			if(b.equals(a[i]))//�ж�a[i]��b��ȫ�Ƿ���ȣ�����boolean���ͣ�����c��c++�е�strcmp��
			{
				isflag = false;
				System.out.println("��ϲ���ҵ�Ԫ��λ��" + i);
				break;
			}
		}
		if(isflag)
		{
			System.out.println("���ź�û�ҵ�");
		}
		//���ַ� ǰ����������������
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
				System.out.println("��ϲ���ҵ�����Ԫ�ص�λ��" + middle);
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
			System.out.println("���ź�û�ҵ�");
		}
		//ð������ ��С������������
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
