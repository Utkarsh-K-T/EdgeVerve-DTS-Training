@FunctionalInterface
interface Student
{
    void study(String sub1, int sub1Code , String sub2, int sub2Code);
}

public class hLambdaExpWithMultiArgs 
{
    public static void main(String[] args) 
    {
        Student ref = 
        (s1,n1,s2,n2) ->
        {
            System.out.println("Studying : "+s1+" "+n1);
            System.out.println("Studying : "+s2+" "+n2);

        };
        ref.study("Java",101,"Oracle",102);
    }
}
