import java.util.Scanner;
//import java.util.Arrays;


class Student{
    int id;
    String name;
    public void setDetaiils(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student data -\n [id = "+ id +", name = "+name+ " ]";
    }
}


public class dArrayInClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student [3];
        s[0] = new Student();
        s[1] = new Student();
        s[2] = new Student();

        int i;
        for(i=0; i<s.length; i++){
            s[i] = new Student();
        }

        int id;
        String name;

        for(i=0; i<s.length; i++){
            System.out.println("Enter the id and name : ");
            id = sc.nextInt();
            sc.nextLine();
            name = sc.nextLine();
            s[i].setDetaiils(id, name);
        }

        for(Student st:s){
            System.out.println(st);
        }

        //System.out.println(s); whys does it returns ramdom code?
        //System.out.println(Arrays.toString(s)); is its soln
        sc.close();
    }
}
