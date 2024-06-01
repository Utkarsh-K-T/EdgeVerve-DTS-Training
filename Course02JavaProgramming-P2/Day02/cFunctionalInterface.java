//Functional Interface (or SAM interface) type of interface with only one abstract method per interface

@FunctionalInterface
interface Sample
{
    void show();//public abstract void show internal definition of this method
}

class sampleImpl implements Sample
{
    @Override
    public void show()
    {
        System.out.println("show method invoked!");
    }
}

public class cFunctionalInterface {
    public static void main(String[] args) {
        sampleImpl obj = new sampleImpl();
        obj.show();
    }
}
