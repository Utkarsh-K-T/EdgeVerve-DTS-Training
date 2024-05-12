import java.util.Scanner;

class Fact{
    public int findFact(int n){
        int i = 1, f =1;
        for(;i<=n;i++){
            f*=i;
        }
        return f;

    }
}


public class eFactUsingClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fact ref;
        ref = new Fact();
        int f = ref.findFact(5);
        System.out.println(f);

        //Anonymous Objects can be invoked only once
        int an = new Fact().findFact(5);
        System.out.println(an);

        sc.close();
    }
}
