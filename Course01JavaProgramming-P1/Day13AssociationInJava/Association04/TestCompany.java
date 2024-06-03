package Association04;

import java.util.Scanner;

public class TestCompany {
    public static void main(String[] args) {
        Address address = new Address("100 A", "ABC", "Pune");
        Departments dept[] = new Departments[3];
        int id = 100;
        String name;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Etner department name : ");
            name = sc.next();
            dept[i] = new Departments(id, name);
            id++;
        }
        Company com = new Company("ABC LTD", dept, address);
        System.out.println(com);
        sc.close();
    }
}
