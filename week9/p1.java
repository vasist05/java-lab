//1.Write a Java program to demonstrate the List interface using ArrayList and LinkedList. Perform insertion,
// accessing, updating, searching, and deletion operations on both collections.  
import java.util.*;
public class p1
{
public static void main(String[] args)
{

ArrayList<Integer> list = new ArrayList<>();

list.add(20);
list.add(40);
list.add(36);
list.add(1213);

System.out.println("i am printing list now  " +list);

System.out.println(list.get(0));

list.set(1,100);
System.out.println("new list  " + list);

System.out.println(list.contains(40));
System.out.println(list.indexOf(1213));

list.remove(Integer.valueOf(1213));
System.out.println(list);


LinkedList<Integer> list2 = new LinkedList<>();

list2.add(12);
list2.add(32);
list2.add(456);
list2.add(493);
list2.add(69);

System.out.println("original linkedlist:" + list2);

System.out.println(list2.get(2));

list2.set(2,344);

System.out.println("updated one:"+list2);

System.out.println(list2.contains(344));
System.out.println(list2.indexOf(344));

list2.remove(Integer.valueOf(32));
System.out.println("new linkedlist:"+list2);


}
}