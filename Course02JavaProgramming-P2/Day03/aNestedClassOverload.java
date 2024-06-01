class Outer
{
    private int x;
    public Outer(int x)
    {
        this.x = x;
    }
    public void show()
    {
        System.out.println("Outer class show method x : "+x);
    }

    class Inner
    {
        public void show()
        {
            System.out.println("Iniside inner class and x : "+x);
        }
        public void show(int y)//overloading
        {
            System.out.println("Inside inner class and y : "+y);
        }
    }
}

public class aNestedClassOverload
{
    public static void main(String[] args) 
    {
        Outer out = new Outer(3);
        Outer.Inner in = out.new Inner();
        out.show();
        in.show();
        in.show(369);
    }
}