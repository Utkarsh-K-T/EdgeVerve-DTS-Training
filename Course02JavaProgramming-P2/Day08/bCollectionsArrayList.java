import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class bCollectionsArrayList
{
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(105);
        list.add(406);
        list.add(202);
        list.add(307);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("---\nUsing general sort\n---");
        for(int i : list)
        {
            System.out.println(i);
        }

        Comparator<Integer> com = new Comparator<>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }};
               
        Collections.sort(list,com);
        System.out.println("---\nUsing Comparator sort\n---");
        for(int i : list)
        {
            System.out.println(i);
        }
        
        Collections.sort(list, (o1,o2)-> o1%10 > o2%10 ? 1:-1);
        System.out.println("---\nUsing Comparator with Lambda sort\n---");
        for(int i : list)
        {
            System.out.println(i);
        }
    }
}