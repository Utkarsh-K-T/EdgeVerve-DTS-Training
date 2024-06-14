/*
Synchronization :
is a mechanism that ensures that multiple threads can access shared resources safely without causing data inconsistency or corruption. 
It is crucial in multithreading environments where threads often need to share and modify common resources such as objects, variables, or files.
*/

class MyCounter
{
    int count;
    public void doCount()
    {
        count++;
    }
}

public class bSynchronizationThreads 
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
