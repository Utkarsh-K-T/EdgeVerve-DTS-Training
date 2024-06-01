abstract class Sample
{
    public abstract void show();
}

class subClass extends Sample
{
    @Override
    public void show()
    {
        System.out.println("show");
    }

    public void showSub(){
        System.out.println("show sub");
    }

}

public class aAbstractClassInJava{
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.show();
        obj.showSub();
    }
}