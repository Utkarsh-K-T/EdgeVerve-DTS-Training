package Association02;

/*
Create a class Employee id name address
Address class - houseNo, houseName, street, city and pincode
Create a test class and test your
 */

public class TestEmployee {
    public static void main(String[] args) {
        DOB dob = new DOB(12,06,1980);
        Address address = new Address("101 A", "Villa", "Pune");
        Employee emp = new Employee(101,"utkarsh",dob,address);
        System.out.println(emp);
    }
}
QSZW2\






