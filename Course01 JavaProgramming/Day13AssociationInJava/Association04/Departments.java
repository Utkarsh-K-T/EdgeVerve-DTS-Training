package Association04;

public class Departments {
    int deptId;
    String deptName;

    public Departments (int deptId, String deptName){
        super () ;
        this.deptId = deptId;
        this.deptName = deptName;
    }
    @Override
    public String toString(){
        return "Departments ][deptId=" + deptId +", deptName=" + deptName + "]";
    }
}
