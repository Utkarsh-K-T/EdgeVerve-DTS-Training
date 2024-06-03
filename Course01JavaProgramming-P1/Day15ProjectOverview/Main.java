import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = null;
        PlacementOrFurtherEducation placement = null;


        while (true) {
            System.out.println("Welcome to Student Management System");
            System.out.println("1. Add new student and record placement/further education");
            System.out.println("2. Display student details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
    
                    System.out.println("Enter student name: ");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.println("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Select department: ");
                    System.out.println("1. AI & Data Science Engineering");
                    System.out.println("2. Other Engineering");

                    int departmentChoice = scanner.nextInt();
                    CollegeDepartment department = null;
                    switch (departmentChoice) {
                        case 1:
                            department = CollegeDepartment.AI_DataScience_Engineering;
                            break;
                        case 2:
                            department = CollegeDepartment.OTHER;
                            break;

                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    System.out.println("Is the student part-time? (true/false): ");
                    boolean isPartTime = scanner.nextBoolean();
                    student = new PartTimeStudent(name, id, department, isPartTime);


                    System.out.println("Has the student been placed? (true/false): ");
                    boolean placed = scanner.nextBoolean();
                    if (placed) {
                        System.out.println("Enter company name: ");
                        scanner.nextLine(); 
                        String companyName = scanner.nextLine();
                        placement = new PlacementOrFurtherEducation(student.getName(), true, companyName);
                    } else {
                        System.out.println("Enter further education institute: ");
                        scanner.nextLine(); 
                        String institute = scanner.nextLine();
                        placement = new PlacementOrFurtherEducation(student.getName(), false, institute);
                    }
                    System.out.println("Student added and placement/further education recorded successfully!");
                    break;
                case 2:

                    if (student == null) {
                        System.out.println("No student details available.");
                    } else {
                        System.out.println("Student Name: " + student.getName());
                        System.out.println("Student ID: " + student.getId());
                        System.out.println("Department: " + student.getDepartment());
                        if (student instanceof PartTimeStudent) {
                            PartTimeStudent partTimeStudent = (PartTimeStudent) student;
                            System.out.println("Part-Time: " + partTimeStudent.isPartTime());
                        }
                        if (placement != null) {
                            System.out.println("Placement/Further Education Details:");
                            System.out.println("Placed: " + placement.isPlaced());
                            if (placement.isPlaced()) {
                                System.out.println("Company: " + placement.getFurtherEducationInstitute());
                            } else {
                                System.out.println("Institute: " + placement.getFurtherEducationInstitute());
                            }
                        }
                    }
                    break;
                case 3:

                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
