import java.util.Scanner;
class Student{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class cClassInJava {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        int id;
        String name;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the id : ");
         id = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter your name : ");
         name = sc.nextLine();

         /*
        In order to avoid naming conflict of instance variable and local data member
        to make diffrentiation between these both
        this. keyword is use
        it points to current object who is invoking the current method
        */

        /*
         We can generate getters and setter automatically in eclipse using source, then generate them
         */
         s1.setId(id);
         s1.setName(name);
         System.out.println("id : "+s1.getId()+"\nname : "+s1.getName());
         System.out.println(s1.hashCode());//hashCode is a method which is used to acces the hashCode its not the exact address as due to encapsulation the data is encrypted and address is convereted to some hash code!
         System.out.println(s2.hashCode());
         s2.setId(102);
         
         //System.out.println("id : "+s2.getId()+"\nname : "+s2.getName());
         sc.close();
    }
}
