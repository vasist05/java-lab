interface animal
{
    void sound();
}
public class dog implements animal {
     public void sound()

    {
        System.out.println("dog barks");
    } 
public static void main(String[] args)
{
    dog d= new dog();
    d.sound();
}
}