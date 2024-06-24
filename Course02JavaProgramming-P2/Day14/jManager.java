/*
Transient :
keyword is used to indicate that a particular field should not be serialized. 
Serialization is the process of converting an object into a byte stream,
which can then be written to a file, sent over a network, or stored in a database. 
When an object is deserialized, it is reconstructed from this byte stream. 
*/
import java.io.Serializable;

public class jManager implements Serializable
{
    transient int id;
    String name; 

    public jManager(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
