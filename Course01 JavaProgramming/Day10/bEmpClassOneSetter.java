
class Emp{
    private String empName;
    private int empId;
    private int empSal;
    private static int numpEmps;

    private static final String compName;
    static
    {
        compName = "Infosys";
    }

    public void setData(String empName, int empId, int empSal){
        numpEmps++;
        this.empName = empName;
        this.empId = empId;
        this.empSal = empSal;
    }

    public static int getTotalEmp(){
        return numpEmps;
    }

    public static String getCompName(){
        return compName;
    }

    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Employee data :\n"+"[Employee id : "+ empId + "\nEmployee name : "+empName+"\nEmployee salary : "+empSal+"\nCompanyName : "+compName+" ]";
    }
}

public class bEmpClassOneSetter {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setData("Utkarsh", 101, 30000);

        Emp e2 = new Emp();
        e2.setData("Nakul", 102, 60000);

        Emp e3 = new Emp();
        e3.setData("Aditya", 103, 90000);

        System.out.println(e1+"\n");
        System.out.println(e2+"\n");
        System.out.println(e3+"\n");

        System.out.println("The number of employess in "+Emp.getCompName()+" are : "+Emp.getTotalEmp());
    }
}
