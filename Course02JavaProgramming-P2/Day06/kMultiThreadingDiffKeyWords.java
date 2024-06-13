public class kMultiThreadingDiffKeyWords
{
    @SuppressWarnings("deprecation")//for getId()
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread t1 = new Thread(()->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Hello");
            }
        }
        );

        Thread t2 = new Thread(()->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Hii");
            }
        }
        );

        System.out.println(t1.getId());
        t1.start ();
        t1.join();
        System.out.println("Bye");
        System.out.println(t1.isAlive());
        System.out.println(t1.getState());

        System.out.println(t2.getId());
        t2.start ();
        t2.join();
        System.out.println("Bye");
        System.out.println(t2.isAlive());
        System.out.println(t2.getState());

        t1.start();
        t1.join();
        t2.start ();
        t2.join();
        System.out.println("Bye");
        System.out.println(t1.isAlive());
        System.out.println(t1.getState());
        System.out.println("Bye");
        System.out.println(t2.isAlive());
        System.out.println(t2.getState());
    }
}
