
public class pv2 {
    public static void main(String[] args) {
        try {
            int arr[]={10,20,30};
        int a =10;
        int b = 0;
        System.out.println(arr[5]);
        System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println(e2.getMessage());
        }
         catch (Exception e) {
            System.out.println("General Exception");
        }

        
    }
}
