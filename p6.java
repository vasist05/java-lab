class animal{
    animal()
    {
        System.out.println("i am an animal");
    }
}
class dog extends animal{
    dog()
    {
        System.out.println("i am a dog");
    }
}
class puppy extends dog
{
    puppy()
    {
        System.out.println("i am puppy");
    }
}
public class p6
{
    public static void main(String[] args)
    {
        puppy p = new puppy();
    }
}