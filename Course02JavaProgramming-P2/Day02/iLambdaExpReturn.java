@FunctionalInterface
interface Student
{
    String study(String sub1, int sub1Code , String sub2, int sub2Code);
}

public class iLambdaExpReturn
{
    public static void main(String[] args) 
    {
        Student ref = 
        (s1,n1,s2,n2) ->
        {
            System.out.println("Studying : "+s1+" "+n1);
            System.out.println("Studying : "+s2+" "+n2);
            return "Thanks";

        };
        String s = ref.study("Java",101,"Oracle",102);
        System.out.println(s);
        
    }
}
