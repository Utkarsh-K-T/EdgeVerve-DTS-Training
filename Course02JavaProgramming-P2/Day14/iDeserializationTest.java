import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class iDeserializationTest
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("iNew.txt"));
        iManager m = (iManager) in.readObject();
        System.out.println(m.id+" "+m.name);
        in.close();
    }
}
