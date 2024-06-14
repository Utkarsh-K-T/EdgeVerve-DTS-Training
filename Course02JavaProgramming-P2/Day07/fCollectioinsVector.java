import java.util.Vector;

public class fCollectioinsVector 
{
    public static void main(String[] args) 
    {
        Vector<String> v = new Vector<> ();
        v.add("Ram");
        v.add("Sita");
        v.add(1,"Ramayan");
        System.out.println(v);
        for(String name : v)
        {
            System.out.println(name);
        }
    }
}
