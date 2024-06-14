class MyCounter
{
    int count;
    public synchronized void doCount()
    {
        count++;
    }
}

public class cSyunchronizationThreadsLock 
{
    public static void main(String[] args) throws InterruptedException 
    {
        MyCounter c = new MyCounter();

        Thread t1 = new Thread(
            () ->
            {
                for(int i = 0 ; i<10; i++)
                {
                    System.out.println("Hello");
                    c.doCount();
                }
            });
        Thread t2 = new Thread(
            () ->
            {
                for(int i = 0 ; i<10; i++)
                {
                    System.out.println("Hello");
                    c.doCount();
                }
            });
        
        t1.start();
        t1.join();
        
        t2.start();
        t2.join();

        System.out.println(c.count);
    }
}
