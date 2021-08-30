import java.util.Arrays;

public class Compare {
	public static void main(String[] args) {
		Goods [] goods = new Goods[4];
		goods[0] = new Goods("a",41);
		goods[1] = new Goods("b",11);
		goods[2] = new Goods("d",88);
		goods[3] = new Goods("c",100);
		Arrays.sort(goods);
		System.out.println(Arrays.toString(goods));
		for(int i = 0; i < 4; i++)
		{
			System.out.println(goods[i].getname()  +  " " +  goods[i].getprice());
		}
	}
}
class Goods implements Comparable<Object>
{
	private String name;
	private int price;
	Goods(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	public String getname()
	{
		return this.name;
	}
	public int getprice()
	{
		return this.price;
	}
	public int compareTo(Object o)
	{
		if(o instanceof Goods)
		{
			Goods goods = (Goods)o;
			/*if(this.price > goods.price)
			{
				return 1;
			}
			else if(this.price < goods.price)
			{
				return -1;
			}
			else
			{
				return this.name.compareTo(goods.name);
			}*/
			return Double.compare(this.price, goods.price);
		}
		throw new RuntimeException("传入的数据类型不一致");
	}
}