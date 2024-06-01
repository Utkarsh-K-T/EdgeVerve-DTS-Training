@FunctionalInterface
interface Student
{
    void study(String sub);
}

public class gLambdaExpWithArgs 
{
    public static void main(String[] args) 
    {
        Student ref = (s)->System.out.println("Studying : "+s);//we can avoid declaration of data type as (String sub) to sub
        // Student ref = s ->System.out.println("Studying : "+s); this is also ok as it has only one argument
        ref.study("Java");
        
    }
}
