public class eSequenceOfCharInJava {
    public static void main(String[] args) {
        char ch [] = {'h','e','l','l','o'};
        String s = new String(ch);
        String s1 ="hello";
        System.out.println(s.hashCode());//same as s, s1, s2
        System.out.println(ch.hashCode());//different than s, s1, s2
        System.out.println(s1.hashCode());//same as s, s1, s2
        String s2 ="hello";
        System.out.println(s2.hashCode());//same as s, s1, s2
        //String cosntant pool - part of jvm heap memory
        //Special area in heap where jvm stores string constants
        //Why strings in java are immutable?
        /*
        In Java, string literals are stored in a special memory area called the string pool. 
        When you create a string literal, Java first checks the string pool to see if an identical string already exists. 
        If it does, the existing string object is reused, and if not, a new string object is created in the pool.
        */
        System.out.println(s2.hashCode ()); 
        s="hai";//new memory in pool
        System. out.println(s.hashCode ()) ;
        s1="wlecome" ;//new memory in pool
        System.out.println (s1.hashCode ()) ;
        s2="bye";//new memory in pool
        System.out.println (s2.hashCode ()) ;

        StringBuffer r = new StringBuffer("abc");
        StringBuffer r1 = new StringBuffer("abc");

        System.out.println(r.hashCode());
        System.out.println(r1.hashCode());

        System.out.println(s1.compareTo("hello"));
        System.out.println(s1.substring(1,3));
    }
}
