import java.util.Stack;

public class gCollectionsStack 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<> ();
        st.push(10);
        st.push(20);
        st.push(30);
        for(int e : st)
        {
            System.out.println(e);
        }
        System.out.println("---------");
        System.out.println(st.pop());
        System.out.println("---------");
        for(int e:st)
        {
            System.out.println(e);
        }
        System.out.println(st.peek());
    }
}
