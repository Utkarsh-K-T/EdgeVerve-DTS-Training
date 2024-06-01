//cannot have private outer class

class Outer 
{
    private class Inner
    {
        public void showInner () {
            System.out.println ("show methodinside inner");
            }
    }
    public void show () 
    {
        Inner in = new Inner () ;
        in. showInner () ;
    }
}

public class cAccesingMethodsNestedClass{
    public static void main(String[] args) {
        Outer out = new Outer () ;
        out. show() ;
    }
}