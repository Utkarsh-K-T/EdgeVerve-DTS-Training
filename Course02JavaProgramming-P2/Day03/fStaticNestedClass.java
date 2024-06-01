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
        public static void show()
        {
            System.out.println("show method inside inner class y : "+y);
        }
    }
}


public class fStaticNestedClass {
    public static void main(String[] args) {
        Outer out = new Outer(30);
        out.show();
        Outer.Inner.show();
    }
}
