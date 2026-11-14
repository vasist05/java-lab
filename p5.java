class person{
    void display()
    {
        System.out.println("i am a peson");
    }
}
class student extends person{
    void show()
    {
        System.out.println("i am a student");
    }
}
public class p5 {
    public static void main(String[] args) {
        student s = new student();
        s.show();
        s.display();
    }
    }
    

