import java.util.Scanner;
class Student{
    private int id;
    private String name;
    //private String collegename;
    /*
    Shared Memory for college name
     */
    private static String collegeName = "DIT";

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void changeCollegeName(){
        collegeName = "DIT";
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCollegeName(){
        return collegeName;
    }
    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Student [id : "+ id + "\nname : "+name+"\n CollegeName : "+collegeName+" ]";
    }
}

public class fClassInJava {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        Scanner sc = new Scanner(System.in);

        s1.setId(101);
        s1.setName("Utkarsh");
        s1.changeCollegeName();

        s2.setId(102);
        s2.setName("Yoyobanti");
        s2.changeCollegeName();
        System.out.println("id : "+s1.getId()+"\nname : "+s1.getName()+"\n college name : "+s1.getCollegeName());
        System.out.println("id : "+s2.getId()+"\nname : "+s2.getName()+"\n college name : "+s2.getCollegeName());
        System.out.println(s1);
        System.out.println(s2);

        


        sc.close();
    }
}