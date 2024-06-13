
class Thread1 extends Thread
{
    public void show()
    {
        for(int i=0; i<1000; i++)
        {
            System.out.println("Hello");
        }
    }
}

class Thread2 extends Thread
{
    public void show()
    {
        for(int i=0; i<1000; i++)
        {
            System.out.println("Hi");
        }
    }
}

public class cMutlitThreading 
{
    public static void main(String[] args) 
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        t2.start();

        System.out.println("Bye");
    }
}
