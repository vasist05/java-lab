class mt extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(i+" "+getName());

            try{
                Thread.sleep(1000);

            }
            catch(Exception e)
            {
                Thread.yield();
            }
        }
    }
}
public class ph4 {
    public static void main(String[] args) {
        mt t1= new mt();
        mt t2= new mt();

        t1.start();
        t2.start();
        try
        {
            t1.join();
        }
        catch(Exception e)
        {
        }
        System.out.println("main thread ends");
    }
    
}
