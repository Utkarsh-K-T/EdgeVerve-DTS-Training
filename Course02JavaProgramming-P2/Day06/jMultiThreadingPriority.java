public class jMultiThreadingPriority 
{
    public static void main(String[] args) 
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread t1 = new Thread(()->
        {
            System.out.println(Thread.currentThread().getName());
            for(int i=0; i<1000; i++)
            {
                System.out.println("Hello");
            }
        }
        );

        Thread t2 = new Thread(()->
        {
            System.out.println(Thread.currentThread().getName());
            for(int i=0; i<1000; i++)
            {
                System.out.println("Hii");
            }
        }
        );
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        // by default priority is 5
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        Thread.currentThread().setName("MyMain");
        System.out.println(Thread.currentThread().getPriority());
        
        t1.setName("MyThread1");
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        
        t1.setPriority(9);
        System.out.println(t1.getPriority());
        t1.start ();
        t2.start();
        System.out.println(Thread.NORM_PRIORITY);
    }
}
