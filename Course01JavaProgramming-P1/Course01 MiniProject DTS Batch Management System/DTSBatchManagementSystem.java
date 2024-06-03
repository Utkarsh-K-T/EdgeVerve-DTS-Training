import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;

import DTSPackages.DTSBatch;
import DTSPackages.DTSCourse;
import DTSPackages.UserAuthenticator;

public class DTSBatchManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static DTSBatch dtsbatch;
    private static final UserAuthenticator[] users = new UserAuthenticator[1];

    public static void main(String[] args) {
        registerUser(); 
        authenticateUser(); 
        initializeDTSBatch();

        int choice;
        int cho = 1 ;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice < 0 || choice > 9) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1 :
                    addCourse();
                    break;
                case 2 :
                    dtsbatch.displayCourses();
                    break;
                case 3 : 
                    do{
                        System.out.println("Welcome to PDF Viewer");
                        System.out.println("1.Week-1 All Assignments");
                        System.out.println("2.Week-2 All Assignments");
                        System.out.println("3.Week-3 All Assignments");
                        System.out.println("4.Exit!");
                        System.out.print("Enter your choice: ");
                        cho = scanner.nextInt();
                        scanner.nextLine();
                        switch (cho) {
                            case 1 :
                                System.out.println("Opening : Week01Utkarsh.pdf");
                                openDTSAssignmetsPDF("Assignments/Week01Utkarsh.pdf");
                                System.out.println("Closed : Week01Utkarsh.pdf");
                                break;
                            case 2 :
                                System.out.println("Opening : Week02Utkarsh.pdf");
                                openDTSAssignmetsPDF("Assignments/Week02Utkarsh.pdf");
                                System.out.println("Closed : Week02Utkarsh.pdf");
                                break;
                            case 3 :
                                System.out.println("Opening : Week03Utkarsh.pdf");
                                openDTSAssignmetsPDF("Assignments/Week03Utkarsh.pdf");
                                System.out.println("Closed : Week03Utkarsh.pdf");
                                break;
                            case 4:
                                System.out.println("Finished reading all assignment!");
                                System.out.println("Exiting the Assignment viewing menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }
                    }while(cho!=4);
                    break;
                case 4 :
                    searchCourse();
                    break;
                case 5 :
                    deleteCourse();
                    break;
                case 6 :
                    enrollForCourse();
                    break;
                case 7 :
                    reserveCourse();
                    break;
                case 8 :
                    cancelReservation();
                    break;
                case 9 :
                    completeCourse();
                    break;    
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void completeCourse() {
        System.out.print("Enter name of course that have been completed : ");
        String returnName = scanner.nextLine();
        dtsbatch.completeCourse(returnName);
    }

	private static void registerUser() {
        System.out.println("\n----- User Registration -----");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        users[0] = new UserAuthenticator(username, password);
        System.out.println("User registered successfully.\n");
    }

    private static void authenticateUser() {
        System.out.println("----- User Login -----");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (!username.equals(users[0].getUsername()) || !password.equals(users[0].getPassword())) {
            System.out.println("Authentication failed. Exiting...");
            System.exit(0);
        }
    }

    private static void initializeDTSBatch() {
        dtsbatch = new DTSBatch();
        System.out.println("DTS Batch initialized.");
    }

    private static void displayMenu() {
        System.out.println("\nDTS Batch Management System Menu:");
        System.out.println("1. Add Course to DTS Batch");
        System.out.println("2. Display All Coruses in DTS Batch");
        System.out.println("3. Display Course Assigments Pdf in DTS Batch");
        System.out.println("4. Search Course in DTS Batch");
        System.out.println("5. Delete Course in DTS Batch");
        System.out.println("6. Enroll for a Course in DTS Batch");
        System.out.println("7. Reserve Course in DTS Batch");
        System.out.println("8. Cancel Reservation for Course in DTS Batch");
        System.out.println("9. Mark Completed Course in DTS Batch");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addCourse() {
        System.out.print("Enter name of the course : ");
        String name = scanner.nextLine();
        System.out.print("Enter tutor of the course : ");
        String tutor = scanner.nextLine();
        System.out.print("Enter number of hours to complete : ");
        int numHrs = scanner.nextInt();
        scanner.nextLine();
        dtsbatch.addCourse(new DTSCourse(name, tutor, numHrs));
    }

    private static void openDTSAssignmetsPDF(String fileName) {
        File pdfFile = new File(fileName);
        if (pdfFile.exists()) {
            try {
                Desktop.getDesktop().open(pdfFile);
            } catch (IOException e) {
                System.out.println("Error opening PDF: " + e.getMessage());
            }
        } else {
            System.out.println("File not found: " + fileName);
        }
    }

    private static void searchCourse() {
        System.out.print("Enter name of the course to search: ");
        String searchName = scanner.nextLine();
        dtsbatch.searchCourse(searchName);
    }

    private static void deleteCourse() {
        System.out.print("Enter name of the course to delete: ");
        String deleteCourse = scanner.nextLine();
        dtsbatch.deleteCourse(deleteCourse);
    }

    private static void enrollForCourse() {
        System.out.print("Enter name of the course for enrollement : ");
        String enrollCourseName = scanner.nextLine();
        dtsbatch.enrollForCourse(enrollCourseName);
    }

    private static void reserveCourse() {
        System.out.print("Enter name of the course to reserve: ");
        String reserveCourse = scanner.nextLine();
        dtsbatch.reserveCourse(reserveCourse);
    }

    private static void cancelReservation() {
        System.out.print("Enter name of the course to cancel reservation: ");
        String cancelCourse = scanner.nextLine();
        dtsbatch.cancelReservation(cancelCourse);
    }
}