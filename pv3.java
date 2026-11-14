class myexception extends Exception
{
    myexception(String msg)
    {
        super(msg);
    }
}
public class pv3 {
    static void checkmarks(int marks) throws myexception
    {
        if(marks<40)
            throw new myexception("student failed");
        else
            System.out.println("student passed");
    }
    public static void main(String[] args) {
        try {
            checkmarks(30);
        } catch (Exception e) {
            System.out.println("exception occured ");
            System.out.println("the message is:" + e.getMessage());
        }
    }
    
}
