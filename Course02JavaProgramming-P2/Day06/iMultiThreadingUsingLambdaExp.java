public class iMultiThreadingUsingLambdaExp 
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(()->
        {
            System.out.println(Thread.currentThread().getName() + " starting.");
            for(int i=0; i<1000; i++)
            {
                System.out.println("Hello");
            }
        }
        );

        Thread t2 = new Thread(()->
        {
            System.out.println(Thread.currentThread().getName() + " starting.");
            for(int i=0; i<1000; i++)
            {
                System.out.println("Hii");
            }
        }
        );

        t1.start ();
        t2.start();
    }
}
