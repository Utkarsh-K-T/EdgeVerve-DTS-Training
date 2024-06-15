/*
Set an interface in java.util
HasSet, LinkedHashSet
SortedSet extending Set -> TreeSet 
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class gCollectionsSet 
{
    public static void main(String[] args) 
    {
        //HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(15);
        set.add(22);
        System.out.println("HashSet");
        System.out.println(set);//HashSet -> sequence is not maintained!
        System.out.println(set.add(10));//Duplicate values are not allowed!
        set.remove(15);
        System.out.println(set);

        //LinkedHashSet
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(15);
        set1.add(22);
        System.out.println("LinkedHashSet");
        System.out.println(set1);//LinkedHashSet -> sequence is maintained!
        System.out.println(set1.add(10));//Duplicate values are not allowed!
        set1.remove(15);
        System.out.println(set1);

        //TreeSet
        Set<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(15);
        set2.add(22);
        System.out.println("TreeSet");
        System.out.println(set2);//TreeSet -> sorted ascending order maintained and retrival time is least!
        System.out.println(set2.add(10));//Duplicate values are not allowed!
        set2.remove(15);
        System.out.println(set2);

    }
}
