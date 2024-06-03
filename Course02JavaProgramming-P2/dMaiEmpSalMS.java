//SalaryCalculator interface
interface SalaryCalculator {
    double calculateSalary();
}

public class dMaiEmpSalMS {
    public static void main(String[] args) {
        // Create an instance of SalaryCalculator using an anonymous inner class
        SalaryCalculator employeeSalaryCalculator = new SalaryCalculator() {
            @Override
            public double calculateSalary() {
                double baseSalary = 50000.0;
                double bonus = 5000.0;
                return baseSalary + bonus;
            }
        };

        double salary = employeeSalaryCalculator.calculateSalary();
        System.out.println("The salary of the employee is: Rs" + salary);
    }
}
