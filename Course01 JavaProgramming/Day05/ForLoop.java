public class ForLoop{
    public static void main(String[] args) {
        int i = 1;
        for(;i<=10;i++){
            System.out.println(i);
        }
        System.out.println(i);
        i = 1;
        for(;i<=10;i++){
            System.out.println(i);
        }
        System.out.println(i);
        i = 1;
        System.out.println(i);
        for(;i<=10;i++);
        System.out.println(i);
        //for(;;); infinite loop
    }
}