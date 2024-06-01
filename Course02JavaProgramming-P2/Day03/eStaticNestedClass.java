//Static Nested Class
//Declared inside a class using static keyword
//cannot access non static data members and methods

class Outer{
    private int x;
    private static int y = 20;
    public Outer(int x)
    {
        this.x=x;
    }
    public void show()
    {
        System.out.println("show method inside outer class x : "+x);
    }
    static class Inner
    {
        public void show()
        {
            System.out.println("show method inside inner class y : "+y);
        }
    }
}

public class eStaticNestedClass {
    public static void main(String[] args) {
        Outer out = new Outer(30);
        out.show();
        Outer.Inner in = new Outer.Inner();
        in.show();
    }
}
