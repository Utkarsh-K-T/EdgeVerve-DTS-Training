class Thread1 implements Runnable
{
    @Override
    public void run()
        {
            System.out.println(Thread.currentThread().getName() + " starting.");
            for(int i=0; i<1000; i++)
            {
                System.out.println("Hello");
            }
            try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " ending.");
        }
}

class Thread2 implements Runnable
{
    public void run()
        {
            System.out.println(Thread.currentThread().getName() + " starting.");
            for(int i=0; i<1000; i++)
            {
                System.out.println("Hii");
            }
            try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " ending.");
        }
}


public class gMultiThreading 
{
    public static void main(String[] args) 
    {
        Runnable r1 = new Thread1();
        Runnable r2 = new Thread2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.start();
        t2.start();
    }

}
