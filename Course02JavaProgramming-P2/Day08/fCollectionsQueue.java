import java.util.ArrayDeque;

public class fCollectionsQueue 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        System.out.println(dq);

        dq.addFirst(40);
        System.out.println(dq);

        dq.addLast(60);
        System.out.println(dq);

        dq.remove();
        System.out.println(dq);

        dq.remove(20);
        System.out.println(dq);
    }

}
