abstract class Employee 
{
    protected int id;
    protected String name;

    // Constructor to initialize id and name
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Overriding toString method to return employee details as a string
    @Override
    public String toString() {
        return "Employee ID: " + id + "\nEmployee Name: " + name;
    }
}

// PartTimeEmployee class extending Employee
class PartTimeEmployee extends Employee 
{
    private int noOfDaysWorked;
    private int noOfHoursWorkedPerDay;
    private double hourlyRate;

    // Constructor to initialize PartTimeEmployee details
    public PartTimeEmployee(int id, String name, int noOfDaysWorked, int noOfHoursWorkedPerDay, double hourlyRate) {
        super(id, name);
        this.noOfDaysWorked = noOfDaysWorked;
        this.noOfHoursWorkedPerDay = noOfHoursWorkedPerDay;
        this.hourlyRate = hourlyRate;
    }

    // Overriding calculateSalary method to calculate salary for part-time employee
    @Override
    public double calculateSalary() {
        return noOfDaysWorked * noOfHoursWorkedPerDay * hourlyRate;
    }

    // Overriding display method to show part-time employee details
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Days Worked: " + noOfDaysWorked);
        System.out.println("Number of Hours Worked Per Day: " + noOfHoursWorkedPerDay);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }

    // Overriding toString method to return part-time employee details as a string
    @Override
    public String toString() {
        return super.toString() + "\nNumber of Days Worked: " + noOfDaysWorked +
               "\nNumber of Hours Worked Per Day: " + noOfHoursWorkedPerDay +
               "\nHourly Rate: " + hourlyRate +
               "\nTotal Salary: " + calculateSalary();
    }
}


public class cAbstractionProblem 
{
    public static void main(String[] args) {
        // Creating a PartTimeEmployee object
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(1, "John Doe", 20, 4, 15.0);

        // Displaying PartTimeEmployee details
        partTimeEmployee.display();

        // Displaying PartTimeEmployee details using toString method directly
        System.out.println(partTimeEmployee.toString());
    }
}
