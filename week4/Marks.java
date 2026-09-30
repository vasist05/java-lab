//Program 1: Student Marks Calculation
//Write a Java program to calculate the total marks of students using method overloading.
//One method should calculate the total for three subjects, and another method should calculate the total for four subjects.
public class Marks
{
int average;
int total;
	public  void calc(int m1,int m2,int m3)
{
//int marks1=m1;
//int marks2=m2;
//int marks=m3;
total=(m1+m2+m3);
System.out.println("the total marks are:"+total);
}
public  void calc(int m1,int m2,int m3,int m4)
{
total=(m1+m2+m3+m4);
System.out.println("the total marks are:"+total);
}
public static void main(String[] args)
{
Marks m=new Marks();

m.calc(10,20,30);
m.calc(10,20,30,40);
}
}

