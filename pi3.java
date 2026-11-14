import java.util.*;
class student implements Comparable<student>
{
    int marks;
    String name;
    student(int m , String n)
    {
        marks=m;
        name=n;
    }

    public int compareTo(student s)
    {
        return this.marks-s.marks;
    }
}
class comparename implements Comparator<student>
{
    public int compare(student a , student b)
    {
        return a.name.compareTo(b.name);
    }
}
public class pi3 {
    public static void main(String[] args) {
        student s1 = new student(20,"vasist");
        student s2 = new student(40,"gopika");
        student s3= new student(35,"ram");

        ArrayList<student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list);

        for(student x : list)
        {
            System.out.println(x.name+ " :"+ x.marks);
        }
        Collections.sort(list,new comparename());
        for(student x : list)
        {
            System.out.println(x.name+ " :"+ x.marks);
        }


        

    }
    
}
