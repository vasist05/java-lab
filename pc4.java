class mathutility{
final double PI=3.14;
final int max_val=100;

static double areaofcir(double r)
{
    return 3.14*r*r;
}
static double sq(double a)
{
    return a*a;
}
final void display()
{
    System.out.println(PI+" "+max_val);
}

}
public class pc4 {
    public static void main(String[] args) {
        mathutility m = new mathutility();
        System.out.println(mathutility.areaofcir(5.4));
        System.out.println(mathutility.sq(4));
        m.display();
    }
    
}
