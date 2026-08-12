/*4.Write a Java program to demonstrate an abstract class containing an abstract method and a concrete method. */
public class P4
{
public static void main(String[] args)
{
	student s=new student();
	s.show();
s.write();
}
}
abstract class person
{
abstract void write();

void show()
{
System.out.println("this is a concrete method");
}
}
class student extends person
{
void write()
{
System.out.println("writing for abstract class.");
}
}
