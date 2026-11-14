class table
{
    synchronized void display(String name)
    {
        System.out.println(name);

        for(int i = 0; i < 3; i++)
        {
            System.out.println(i);
        }
    }
}

class mythread extends Thread
{
    table t;

    mythread(table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.display(getName());
    }
}

public class ph6
{
    public static void main(String[] args)
    {
        table t = new table();

        mythread t2 = new mythread(t);
        mythread t3 = new mythread(t);

        t2.start();
        t3.start();
    }
}