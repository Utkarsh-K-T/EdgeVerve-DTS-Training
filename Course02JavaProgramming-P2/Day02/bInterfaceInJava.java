// abstract class -- class - extends
// interface -- interface - extends
//interface - class implements

interface Sample
{
    void show();
}

interface Sample1
{
    void greet();
}

class subClass implements Sample, Sample1
{
    @Override
    public void show()
    {
        System.out.println("show");
    }

    public void showSub()
    {
        System.out.println("show sub");
    }

    @Override
    public void greet()
    {
        System.out.println("hello");
    }

}


public class bInterfaceInJava {
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.show();
        obj.showSub();
        obj.greet();
    }
}



