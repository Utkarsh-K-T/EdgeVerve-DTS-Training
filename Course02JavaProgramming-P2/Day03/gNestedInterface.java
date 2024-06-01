/*
Nested Interface -
Can be written inside anoter interface or another class
*/

interface Printable
{
    interface Drawable
    {
        void draw();
    }
}

class PrintableClass implements Printable.Drawable
{
    @Override
    public void draw()
    {
        System.out.println("draw");
    }
}

public class gNestedInterface {
    public static void main(String[] args) {
        Printable.Drawable ref = new PrintableClass();
        ref.draw();
        // Map -- Entry
    }
}
