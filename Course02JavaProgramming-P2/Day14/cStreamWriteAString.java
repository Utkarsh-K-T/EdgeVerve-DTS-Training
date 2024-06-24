import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class cStreamWriteAString 
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fos = new FileOutputStream("bNew.txt");
        String s = "Welcome to java streams!";
        byte b[] = s.getBytes();
        fos.write(b);
        fos.close();
        System.out.println("File is created & data is written!");
        
        FileInputStream fin = new FileInputStream("bNew.txt");
        int i = 0;
    
        while((i=fin.read())!= -1)
        {
            System.out.print((char)i);
        }
        fin.close();
    }
}
