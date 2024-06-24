import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class jjtransientSerailization 
{
    public static void main(String[] args) throws IOException 
    {
        jManager m = new jManager(101,"Ram");
        FileOutputStream fout = new FileOutputStream("jNew.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(m);
        fout.close();
        out.close();
    }
}
