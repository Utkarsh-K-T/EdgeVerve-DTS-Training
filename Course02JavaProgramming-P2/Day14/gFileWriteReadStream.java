import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// Driect without byte
public class gFileWriteReadStream 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("gNew.txt");
        fw.write("Welcome to Java!");
        fw.close();

        FileReader fr = new FileReader("gNew.txt");
        int i;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        fr.close();
    }
}
