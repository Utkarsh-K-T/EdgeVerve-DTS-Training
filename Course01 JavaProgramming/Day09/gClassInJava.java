
class Student{
    private int id;
    private String name;
    private static final String collegeName;
    
    static
    {
        System.out.println("Inside Static Block");
        collegeName = "DIT";
    }
    private int counter = 0;// if we not use static then it won't keep track of previous it wil create every time new member
    private static int counters = 0;
    public void setId(int id){
        counter++;
        counters++;
        System.out.println("Count of number of objects : "+counter);
        System.out.println("Count of number of objects using static : "+counters);
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
    public String getCollegeName(){
        return collegeName;
    }

    //final is used to define constants i.e its valude cannot be changed
    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Student [id : "+ id + "\nname : "+name+"\n CollegeName : "+collegeName+" ]";
    }
}


public class gClassInJava {
    public static void main(String[] args) {
        Student s1 = new Student ();
        Student s2 = new Student ();
        //Static Block is executed first!!!
        s1.setId(101);
        s1.setName("Utkarsh");
        System.out.println(s1);

        s2.setId(102);
        s2.setName("YoyoBanti");
        System.out.println(s2);

    }
}
/*
If we try to access a non static data member via static methods we cannot do it!
*/
