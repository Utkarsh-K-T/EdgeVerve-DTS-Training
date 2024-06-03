public class iEnumsInJava {
    enum Color {RED,GREEN,BLUE,YELLOW}
    public static void main(String[] args) {
        for(Color c:Color.values()){
            System.out.println(c);
            System.out.println(Color.valueOf("RED"));
            System.out.println(Color.valueOf("BLUE").ordinal());
        }
    }
}
