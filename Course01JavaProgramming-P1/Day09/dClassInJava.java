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
    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Student [id : "+ id + "\nname : "+name+" ]";
    }
}


public class dClassInJava {
    public static void main(String[] args) {
        Student s1 = new Student();

        int id;
        String name;
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the id : ");
         id = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter your name : ");
         name = sc.nextLine();

         s1.setId(id);
         s1.setName(name);
         System.out.println("id : "+s1.getId()+"\nname : "+s1.getName());
         
         /*
          without @override method
          System.out.println(s1)
          It will return some code which is method defined in object
          */
         System.out.println(s1);
         
         sc.close();
    }
}
