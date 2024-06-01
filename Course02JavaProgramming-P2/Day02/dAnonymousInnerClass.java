/*
Inner class -
a class declared insde another class 
class without a name
only once object can be created
*/


interface Sample
{
    void show();//public abstract void show internal definition of this method
    void greet();//public abstract void greet internal definition of this method 
}
/* 
As our class is here only to implement abstract method we can instead use inner class by direct implementing it without creating anothre class
class sampleImpl implements Sample
{
    @Override
    public void show()
    {
        System.out.println("show method invoked!");
    }
}
*/

public class dAnonymousInnerClass {
    public static void main(String[] args) {
        Sample obj = new Sample() {
            public void show()
            {
                System.out.println("show method invoked!");
            }
            
            public void greet()
            {
                System.out.println("hello!");
            }
        };
        obj.show();
        obj.greet();
    }
}
