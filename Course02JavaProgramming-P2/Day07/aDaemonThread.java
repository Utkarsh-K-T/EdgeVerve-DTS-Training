/*
A daemon thread is a background thread that is designed to perform tasks such as garbage collection, background tasks, and other housekeeping operations while the main application is running. 
These threads are typically low-priority and are used for tasks that are not essential for the application to complete its work. 
*/

public class aDaemonThread
{
    public static void main(String[] args) 
    {
        Thread t = new Thread(
            () ->
            {
                for(int i = 0 ; i<10; i++)
                {
                    System.out.println("Hello");
                }
            });
        
        System.out.println(Thread.currentThread().isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}