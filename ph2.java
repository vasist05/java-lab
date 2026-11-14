class mythread implements Runnable{
    public void run()
    {
        System.out.println("the thread is running");
    }

}
public class ph2 {
    public static void main(String[] args) {
        mythread obj = new mythread();
        Thread t = new Thread(obj);
        t.start();
    }
    
}
