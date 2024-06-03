
class Student{
    private int id;
    private String name;
    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    //Encapasulation
    /*
     if members and methods are public or default then they 
     can be initialized directly 
     but if the members/methods are private then they are initialized using public getters and setters
     */
}


public class bEncapasulationinJava {
    public static void main(String[] args) {
        Student s1 = new Student ();
        Student s2 = new Student ();

        //setter & getters;
        s1.setId(101);
        s1.setName("Utkarsh");
        System.out.println("id : "+s1.getId()+"\nname : "+s1.getName());
        s2.setId(103);
        s2.setName("YoyoBanti");
        System.out.println("id : "+s2.getId()+"\n name : "+s2.getName());
    }
}
