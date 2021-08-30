public class day7  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		MyDate m1 = new MyDate(3,1,2002);
		MyDate m2 = new MyDate(3,1,2002);
		boolean isequals = m1.equals(m2);
		System.out.println(isequals);
		System.out.println(m1.toString());
	}
}
class MyDate
{
	private int day;
	private int month;
	private int year;
	MyDate(int day,int month,int year)
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean equals(Object obj)//Object obj = new MyDate();
	{
		if(this == obj)
		{
			return true;
		}
		if(obj instanceof MyDate)
		{
			MyDate myDate = (MyDate)obj;
			return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
		}
		return false;
	}
	public String toString()
	{
		return "Äê : " + year + "ÔÂ £º" + month + "ÈÕ : " + day;
	}
}