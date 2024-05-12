public class DataTypes {
    public static void main(String[] args) {
        int num = 3;
        char ch = 'U';
        float fl = 3.6f;
        double dob = 3.69345678;
        boolean bol = true;
        String str1 = "1Hello, World!";
        String str2 = "2Hello, World!";
        String name = "Utkarsh";
        int age = 21;

        System.out.println("Primitive Data Types:");
        System.out.println("Integer :"+ num);
        System.out.println("Character :"+ch);
        System.out.println("Float : " + fl);
        System.out.println("Double : " + dob);
        System.out.println("Double : " + bol);
        System.out.print("String : " + str1);
        System.out.print("String : " + str2);
        System.out.printf("\nHello! my name is %s and am %d year old.\n",name, age);
    }
}