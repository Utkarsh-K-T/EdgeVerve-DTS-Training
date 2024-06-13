

public class hMultiThreadingUsingInnerClass 
{
    public static void main(String[] args) 
    {
        Runnable r1 = new Thread()
        {
            public void run()
            {
                System.out.println(Thread.currentThread().getName());
                for(int i=0; i<10; i++)
                {
                    System.out.println("Hello");
                }
            }
        };
        Runnable r2 = new Thread()
        {
            public void run()
            {
                System.out.println(Thread.currentThread().getName());
                for(int i=0; i<10; i++)
                {
                    System.out.println("Hii");
                }
            }
        };
        Thread t1 = new Thread(r1,"MyThread1");
        Thread t2 = new Thread(r2,"MyThread2");

        t1.start();
        t2.start();

    }
}
