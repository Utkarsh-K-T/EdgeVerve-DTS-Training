import java.io.FileInputStream;
import java.io.IOException;

public class bStreamsReadFile 
{
    public static void main(String[] args) throws IOException 
    {
        FileInputStream fin = new FileInputStream("aNew.txt");
        int i = fin.read();
        System.out.println("File aNew.txt contains : "+i);
        fin.close();
    }
}
