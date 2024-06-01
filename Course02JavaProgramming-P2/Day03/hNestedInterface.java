//Nested interface using class
//able suffixes are used most probably for declaring name of interfaces
class Prints
{
    interface Drawable
    {
        void draw();
    }
}

class Draws implements Prints.Drawable
{
    @Override
    public void draw()
    {
        System.out.println("draw");
    }
}



public class hNestedInterface {
    public static void main(String[] args) {
        Prints.Drawable ref = new Draws();
        ref.draw();y
    }
}
