/*
Collections :
is a group of objects represented as a single unit
used to store, retrieve, manipulate, and communicate aggregate data
provide a way to manage groups of objects efficiently and support operations such as adding, removing, and iterating over elements

Java Collections Framework : 
provides a set of interfaces and classes for managing collections of objects
includes various types of collections like lists, sets, queues, and maps, each tailored to different needs

Java Collections Framework Hierarchy :
1. Collection (add, remove, size, and iterator)         
2. List (ArrayList, LinkedList, Vector)
3. Set (HashSet, LinkedHashSet, TreeSet)               
4. Queue (PriorityQueue, LinkedList)
5. Deque (ArrayDeque, LinkedList)            
6. Map   (HashMap, TreeMap, LinkedHashMap, Hashtable)
7. Sorted Set
8. Sorted Map
9. Navigable Set       
10. Navigable Map

java.lang.Iterable
  └── java.util.Collection
        ├── java.util.List
        │     ├── java.util.ArrayList
        │     ├── java.util.LinkedList
        │     └── java.util.Vector
        ├── java.util.Set
        │     ├── java.util.HashSet
        │     ├── java.util.LinkedHashSet
        │     └── java.util.TreeSet (implements NavigableSet)
        ├── java.util.Queue
        │     ├── java.util.LinkedList
        │     ├── java.util.PriorityQueue
        │     └── java.util.ArrayDeque (implements Deque)
        └── java.util.Deque
              └── java.util.ArrayDeque
java.util.Map
  ├── java.util.HashMap
  ├── java.util.LinkedHashMap
  ├── java.util.TreeMap (implements NavigableMap)
  └── java.util.Hashtable

Framewrok :
is a reusable set of libraries or classes that provide a standard way to build and deploy applications
serves as a foundation for developing software by providing generic functionality that can be selectively overridden or extended by user code to create specific applications

Examples of Frameworks :
Spring Framework (Java)
Hibernate (Java)
Django (Python)
React (JavaScript)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class dCollectionsInJavaList
{
    public static void main(String[] args) 
    {
        List list = new ArrayList();
        list.add(10);
        list.add("Utkarsh");
        list.add(369.999);
        System.out.println(list);

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(500);
        listInt.add(300);
        listInt.add(1,600);
        listInt.add(2,100);
        System.out.println(listInt);

        ArrayList<Integer> listInt2 = new ArrayList<>();
        listInt2.add(200);
        listInt2.add(400);
        System.out.println(listInt2.size());
        System.out.println(listInt2);

        listInt2.addAll(1,listInt);
        System.out.println(listInt2.size());
        System.out.println(listInt2);
        

        listInt2.remove(3);
        System.out.println(listInt2);

        System.out.println(listInt2.contains(100));
        System.out.println(listInt2.contains(200));

        Collections.sort(listInt2);
        System.out.println(listInt2);
        Collections.sort(listInt2,Collections.reverseOrder());
        System.out.println(listInt2);

        listInt2.remove(4);
        System.out.println(listInt2);
        System.out.println(listInt2.size());

        Iterator<Integer> itr = listInt2.iterator();//traverse only in fwd direction
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("---------");
        for(int e:listInt2)//unboxing happens automatically
        {
            System.out.println(e);
        }
    }
}
