import java.util.Collections;
import java.util.LinkedList;

public class eCollectionsInJavaLinkedList
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.addFirst(200);
        list.addLast(300);
        list.add(1,250);
        System.out.println(list);
        System.out.println(list.contains(300));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        list.add(100);
        list.addFirst(200);
        list.addLast(300);
        list.add(1,250);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        LinkedList<String> ls = new LinkedList<>();
        ls.add("Apple");
        ls.add("Orange");
        ls.add("Banana");
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);

    }
    
}