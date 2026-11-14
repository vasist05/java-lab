interface gopika
{
    void show();

    default void display()
    {
        System.out.println("this is default function");
    }
}
public class pk1 {
    public static void main(String[] args) {
        
    
    gopika g = () -> System.out.println("hehe function");

    g.show();
    g.display();
    
}
}
