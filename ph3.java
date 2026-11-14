class mythread extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class ph3 {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        mythread t3 = new mythread();

        t3.setPriority(10);
        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

    }
    
}
