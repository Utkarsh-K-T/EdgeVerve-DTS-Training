package Association04;

import java.util.Arrays;

public class Company {
    String name;
    Departments dept[];
    Address address;

    public Company (String name, Departments[] dept, Address address) {
        this.name = name;
        this.dept = dept;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Company [name="+ name + ", dept=" + Arrays. toString(dept) + ", address=" + address + "]";
    }
}
