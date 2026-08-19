/*Title: Write a Java program to demonstrate inheritance between interfaces.
Create interface Person with method displayName().
Create interface Student that extends Person and has method displayMarks().
Create a class CollegeStudent that implements Student.
Implement both methods and display the student's name and marks.
*/
interface person
{
void displayname();
}
interface student extends person
{
void marks();
}
class collegestudent implements student
{
public void displayname()
{
System.out.println("my name is vasist");
}
public void marks()
{
System.out.println("my marks are : 50");
}
}
public class p3
{
public static void main(String[] args)
{
collegestudent c=new collegestudent();
c.displayname();
c.marks();
}
}