import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dBufferedOutputStream 
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fos = new FileOutputStream("dNew.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fos);
        String s = "Welcome to java!";
        byte b [] = s.getBytes();
        bout.write(b);
        bout.close();
        fos.close();

        FileInputStream fin = new FileInputStream("dNew.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i ;
        while((i=bin.read())!= -1)
        {
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
    }
}
