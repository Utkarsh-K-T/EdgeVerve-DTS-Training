public class even {
    public static void main(String[] args) {
        int a = 10 , b =3;
        boolean isaeven = (a%2==0) ? true:false;
        boolean isbeven = (b%2==0) ? true:false;

        String Isaeven = (a%2==0) ? "Even":"Odd";
        String Isbeven = (b%2==0) ? "Even":"Odd";

        System.out.println(isaeven);
        System.out.println(isbeven);
        System.out.println(Isaeven);
        System.out.println(Isbeven);
    }
}
