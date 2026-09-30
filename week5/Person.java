public class Person
{
	Person()
{
System.out.println("hello this is from person class.");
}
public static void main(String[] args)
{
student s =new student();
s.show1();
}
}

class student extends Person
{
void show1()
{
System.out.println("hello from student class");
}
}

