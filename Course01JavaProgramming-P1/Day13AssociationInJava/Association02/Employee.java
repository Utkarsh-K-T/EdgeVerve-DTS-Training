package Association02;

public class Employee {
    int id;
    String name;
    DOB dob;
    Address address;

    public Employee(int id, String name,DOB dob, Address address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    @Override
    public String toString(){
        return " Employee [ id = "+id+" , name = "+ name +" , dob = "+dob+" , add = "+address;
    }
}