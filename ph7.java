class buffer
{
    int data;
    boolean available = false;

    synchronized void produce(int d)
{
    while(available)
        try {
            wait();
        } catch (Exception e) {
        }
    data=d;
    System.out.println("produced: "+ data);
    available=true;
    notifyAll();

}
synchronized void consume()
{
    while(!available)
    {
        try {
            wait();
        } catch (Exception e) {
        }
    }
    System.out.println("consumed:"+ data);
    available=false;
    notifyAll();
}
}
public class ph7 {
    public static void main(String[] args)
    {
        buffer b = new buffer();
        Thread t1= new Thread(()->b.produce(10));
        Thread t2= new Thread(()->b.consume());
        t1.start();
        t2.start();
    }
    
}
