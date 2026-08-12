/*3.Write a Java program to demonstrate hierarchical inheritance using Shape as the superclass and Circle and Rectangle as subclasses. */
public class P3
{
	public static void main(String[] args)
		{
			Circle c=new Circle();
			c.show();
			c.tell();
			Rectangle r=new Rectangle();
			r.write();
			r.tell();
		}
}
class Shape
{
	void tell()
		{
			System.out.println("this is a shape");
		}
}
class Circle extends Shape
{
	void show()
		{	
			System.out.println("i am a circle i am in round shape.");
		}
}
class Rectangle extends Shape
{
	void write()
		{
			System.out.println("i am a rectangle ");
		}
}
