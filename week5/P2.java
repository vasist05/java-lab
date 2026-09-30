/*2.Write a Java program to demonstrate multilevel inheritance using Animal, Dog, and Puppy classes. */
 class Animal
{
void show1()
{
System.out.println("i am from class animal");
}
}
class Dog extends Animal
{
void show2()
{
System.out.println("i am from class dog");
}
}
class Puppy extends Dog
{
void show3()
{
System.out.println("i am from class Puppy");
}
}
public class P2
{
public static void main(String[] args)
{
Puppy p =new Puppy();
p.show3();
p.show2();
p.show1();
}
}
