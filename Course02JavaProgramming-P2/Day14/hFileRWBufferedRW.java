import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class hFileRWBufferedRW 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("hNew.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Welcome to Java!");
        bw.close();
        fw.close();

        FileReader fr = new FileReader("hNew.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while((i=br.read())!=-1)
        {
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
