import java.util.Scanner;

class Emp{
    private int empId;
    private String empName;
    private int sal;
    private static int numEmps;

    private static final String compName;
    
    static
    {
        compName = "Infosys";
    }

    public void setId(int empId){
        numEmps++;
        this.empId = empId;
    }
    public void setSal(int sal){
        this.sal = sal;
    }
    public void setName(String empName){
        this.empName = empName;
    }
    
    public int getId(){
        return empId;
    }
    public int getSal(){
        return sal;
    }
    public String getName(){
        return empName;
    }
    public static String getCompName(){
        return compName;
    }
    public static int getTotalEmp(){
        return numEmps;
    }

    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Employee data :\n"+"[Employee id : "+ empId + "\nEmployee name : "+empName+"\nEmployee salary : "+sal+"\nCompanyName : "+compName+" ]";
    }
    
    
}

public class aEmpClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emp e1 = new Emp();
        e1.setId(101);
        e1.setSal(30000);
        e1.setName("Utkarsh");

        Emp e2 = new Emp();
        e2.setId(102);
        e2.setSal(60000);
        e2.setName("Aditya");

        Emp e3 = new Emp();
        e3.setId(103);
        e3.setSal(90000);
        e3.setName("Nakul");

        System.out.println(e1+"\n");
        System.out.println(e2+"\n");
        System.out.println(e3+"\n");

        System.out.println("The number of employess in "+Emp.getCompName()+" are : "+Emp.getTotalEmp());
        sc.close();
    }
}