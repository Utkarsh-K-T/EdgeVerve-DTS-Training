import java.io.Serializable;

public class iManager implements Serializable 
{
    int id;
    String name; 

    public iManager(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
