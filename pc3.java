class bank
{
    private int bankacc;
    private String accholder;
    private double balance;

    bank(int b , String a , double bb)
    {
        bankacc=b;
        accholder=a;
        balance=bb;
    }

    void deposit(double amt)
    {
        balance+=amt;
    }
    void withdraw(double amt)
    {
        if(amt<=balance)
            balance-=amt;
        else
        System.out.println("no sufficent balance");
    }
    void getbal()
    {
         System.out.println(balance);
    }
}
public class pc3 {
    public static void main(String[] args) {
        bank b = new bank(101,"vasist",5000.545);
        b.deposit(4554);
        b.getbal();
        b.withdraw(564);
        b.getbal();

        
    }
}
