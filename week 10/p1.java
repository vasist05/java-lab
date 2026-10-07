class box
{
int a;
box(int value)
{
a=value;
System.out.println(" this is normal class");
System.out.println(a);
}
}
public class p1
{
public static void main(String[] args)
{
box b = new box(93);
}
}