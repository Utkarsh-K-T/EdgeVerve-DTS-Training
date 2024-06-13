/*
Threads :
Threads, also known as lightweight processes, are the smallest unit of execution within a process.
A single process can contain multiple threads, all of which share the same memory space but can execute independently. 

Characteristics of Threads :
Concurrency
Shared Resources
Independent Execution
Lightweight

Advantages of Threads :
Improved Performance
Responsiveness
Simplified Program Structure

Disadvantages of Threads :
Complexity
Debugging Difficulties
Resource Contention

Use Cases of Threads :
Web Servers
Real-Time Systems
Multimedia Applications
Scientific Computing

Thread life cycle :
The lifecycle of a thread in programming encompasses various states it can be in from its creation to its termination.
1. New (or Born) State
2. Runnable (or Ready-to-Run) State
3. Running State
4. Blocked (or Waiting) State
5. Timed Waiting State
6. Terminated (or Dead) State

Threads In Java : 
hreads in Java are a fundamental feature for concurrent programming, allowing multiple tasks to run in parallel within a single application. 
This is crucial for leveraging multi-core processors and enhancing the performance of complex applications.
*/

import java.util.Scanner;


public class aMultiThreadingbasics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(Thread.currentThread().getName());//main : by default jvm creates a thread named main
        System.out.println(Thread.currentThread().getPriority());//5

        sc.close();
    }
}