interface person{
    void name();
}
interface student extends person{
    void marks();
}
class college implements student
{
    public void name()
    {
        System.out.println("his name is jshs");
    }
      public void marks()
    {
        System.out.println("my marks are : 69 ");
    }
}

public class p4 {
    public static void main(String[] args) {
        college c = new college();
        c.name();
        c.marks();
    }
    
}
