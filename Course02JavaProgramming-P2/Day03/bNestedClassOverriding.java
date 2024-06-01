class Outer
{
    public void show()
    {
        System.out.println("Outer class show");
    }

    class Inner extends Outer // cannot extends can't achieve method overriding
    {
        @Override
        public void show()
        {
            System.out.println("Iniside inner class");
        }
    }
}

public class bNestedClassOverriding {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();
        out = out.new Inner();
        out.show();
    }
}
