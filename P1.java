/*Title: Write a Java program to demonstrate the implementation of a simple interface.
Create an interface Animal with a method sound().
Create a class Dog that implements Animal.
Implement sound() in Dog.
Display the sound of the dog.
*/
interface Animal
{
void sound();
}

class dog implements Animal
{
public void sound()
{
System.out.println("boww boww");
}
}
public class P1
{
public static void main(String[] args)
{
new dog().sound();
}
}