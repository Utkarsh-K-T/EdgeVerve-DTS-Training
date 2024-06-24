/*
Serialization and Deserialization  
Serialization:
- is the process of writing an objects state into byte streams
- writeObject() 
- objectOutputStream()

Deserialization: 
- Byte stream is converted to an object
- readObject()
- objectInputSteam()
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class iSerizlizationTest
{
    public static void main(String[] args) throws IOException 
    {
        iManager m = new iManager(101,"Ram");
        FileOutputStream fout = new FileOutputStream("iNew.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(m);
        fout.close();
        out.close();
    }
}
