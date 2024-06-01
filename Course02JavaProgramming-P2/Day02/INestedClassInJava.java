/*
Nested Class 
Class inside another class
*/

class Outer
{
    private int value;
    public Outer(int value)
    {
        this.value=value;
    }
    class Inner
    {
        public void show()
        {
            System. out.println ("show Method") ;
            System. out.println ("value="+value) ;
        }

        public void show(int newVal) {
            System.out.println("show Method new val");
            System.out.println("new value=" + newVal);
        }
    }
}


public class INestedClassInJava
{
    public static void main(String[] args) 
    {
        Outer out=new Outer (10) ;
        Outer. Inner obj= out.new Inner ();
        obj.show() ;
        obj.show(369);
    }
}