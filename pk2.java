import java.io.*;
public class pk2 {
    public static void main(String[] args) throws Exception {
        try
        {
            File f = new File("first.txt");
            f.createNewFile();

            FileWriter w = new FileWriter(f);
            w.write("first line");
            w.close();

            FileWriter wa = new FileWriter(f,true);
            wa.write("\n second line");
            wa.close();

            BufferedReader br = new BufferedReader(new FileReader(f));
            String s;
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
            }
            br.close();


        }
        catch(Exception e){}


        
    }
}
