public class day8  
{
	public static void main(String[] args) 
	{
		int num = 10;
		Integer i = num;
		System.out.println(i);
		boolean b = true;
		Boolean b1 = b;
		String s = String.valueOf(num);
		String s1 = String.valueOf(i);
		String s2 = String.valueOf(b);
		String s3 = String.valueOf(b1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		int i1 = Integer.parseInt(s);
		Integer i2 = Integer.parseInt(s1);
		boolean i3 = Boolean.parseBoolean(s2);
		Boolean i4 = Boolean.parseBoolean(s3);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}
}
