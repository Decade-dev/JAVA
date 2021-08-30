public class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test t = new Test();
		t.display(new Circle("»ÆÉ«",1.0,1.0));
		boolean isequals = t.equalsArea(new Circle("»ÆÉ«",1.0,1.0),new Circle("»ÆÉ«",1.0,1.0));
		System.out.println(isequals);
	}
	public void display(GeometricObject g)
	{
		System.out.println(g.findArea());
	}
	public boolean equalsArea(GeometricObject g,GeometricObject gg)
	{
		return g.findArea() == gg.findArea();
	}
}
class GeometricObject
{
	private String color;
	private double weight;
	GeometricObject(String color,double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	public double findArea()
	{
		return 0.0;
	}
}
class Circle extends GeometricObject
{
	private double radius;
	Circle(String color,double weight,double radius)
	{
		super(color,weight);
		this.radius = radius;
	}
	public double findArea()
	{
		return 3.14 * radius * radius; 
	}
}
class MyRectangle extends GeometricObject
{
	private double width;
	private double height;
	MyRectangle(String color,double weight,double width,double height)
	{
		super(color,weight);
		this.width = width;
		this.height = height;
	}
	public double findArea()
	{
		return width * height; 
	}
}