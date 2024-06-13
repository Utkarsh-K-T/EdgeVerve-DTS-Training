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

public class eMultliThreadingJoinSleep
{
    public static void main(String[] args) throws InterruptedException 
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();//runable state
        t2.start();//runable state

        t1.join(); // Waits for t1 to finish
        t2.join(); // Waits for t2 to finish

        try {// Short delay to allow main thread to print "Bye"
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        System.out.println("Bye");
    }
}
