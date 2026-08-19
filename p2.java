/*Title: Write a Java program to demonstrate multiple inheritance using interfaces.
Create two interfaces Printable and Showable.
Declare one method in each interface.
Create a class Demo that implements both interfaces.
Implement both methods and display the results.
*/
interface printable
{
void print();
}
interface showable
{
void show();
}
class demo implements printable,showable
{
public void print()
{
System.out.println(" I am printing this statement");
}
public void show()
{
System.out.println(" I am showing");
}
}
public class p2
{
public static void main(String[] args)
{
new demo().print();
new demo().show();
}
}