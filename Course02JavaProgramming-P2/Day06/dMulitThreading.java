
class Thread1 extends Thread
{
    public void run()
    {
        for(int i=0; i<1000; i++)
        {
            System.out.println("Hello");
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i=0; i<1000; i++)
        {
            System.out.println("Hi");
        }
    }
}


public class dMulitThreading 
{
    public static void main(String[] args) 
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();//runable state
        t2.start();//runable state

        System.out.println(t1.getState());
        System.out.println("Bye");
    }
}
