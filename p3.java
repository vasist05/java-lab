interface printable{
    void print();
}
interface showable{
    void show();
}
class demo implements printable, showable{
    public void print()
    {
        System.err.println("this is printing");

    }
    public void show()
    {
        System.out.println("i am showing");
    }
}
public class p3 {
    public static void main(String[] args)
    {
        demo d = new demo();
        d.show();
        d.print();
    }
    
}
