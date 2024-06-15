import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class aCollectionsList
{
    public static void main(String[] args) 
    {
        List <String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");

        System.out.println("---\nForward\n---");
        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("---\nReverse\n---");
        ListIterator<String> itr1 = list.listIterator(list.size());
        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }

        //Using for
        System.out.println("---\nUsing for\n---");
        for(String s : list)
        {
            System.out.println(s);
        }

        //Using for each
        System.out.println("---\nUsing forEach\n---");
        Consumer<String> con = new Consumer<>()
        {

            @Override
            public void accept(String t) {
                System.out.println(t);
            }
            
        };
        list.forEach(con);

        System.out.println("---\nUsing forEach with Lambda function\n---");
        list.forEach((t)-> System.out.println(t));
    }
}