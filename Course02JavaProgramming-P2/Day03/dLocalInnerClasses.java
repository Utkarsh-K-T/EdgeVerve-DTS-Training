/*
Local Inner classes -
Classes defined in a method or block
*/
class Outer
{
    public void outerMethod()
    {
        System.out.println("Inside outer method");
        class Inner //Scope only inside this method only
        {
            public void methodInner()
            {
                System.out.println("Inside inner method");
            }
        }
        Inner in = new Inner();
        in.methodInner();
    }
}

public class dLocalInnerClasses {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();
    }
}
