//Program 2: Area Calculator
//Write a Java program to calculate the area of different shapes using method overloading.
//Implement methods to calculate the area of a square, rectangle, and circle.
public class Area
{
double area;
public void area(int a)
{
area=a*a;
System.out.println("the area of square is :"+area);
}
public void area(float l,float b)
{
area=l*b;
System.out.println("the area of rectangle is :"+area);
}
public void area(double r)
{
area=3.14*r*r;
System.out.println("the area of circle is :"+area);
}
public static void main(String[] args)
{
Area a=new Area();
a.area(Integer.parseInt(args[0]));             
        a.area(Float.parseFloat(args[1]),
               Float.parseFloat(args[2]));              
        a.area(Double.parseDouble(args[3])); 
}
}



