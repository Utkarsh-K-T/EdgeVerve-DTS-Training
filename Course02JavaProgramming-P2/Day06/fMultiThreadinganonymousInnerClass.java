public class fMultiThreadinganonymousInnerClass
{
    public static void main(String[] args) 
    {

        Thread t1 = new Thread()
        {
            public void run()
            {
                System.out.println(Thread.currentThread().getName() + " starting.");
                for(int i=0; i<10; i++)
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
        };
        
        Thread t2 = new Thread()
        {
            public void run()
            {
                System.out.println(Thread.currentThread().getName() + " starting.");
                for(int i=0; i<10; i++)
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
        };
        
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();//runable state
        t2.start();//runable state

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.getState());
        System.out.println("Bye");

    }
}