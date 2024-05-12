package DTSPackages;

import java.util.ArrayList;
import java.util.List;

public class DTSBatch{
    private List<DTSCourse> courses;
    private int numCourses;
    
    public DTSBatch() {
        courses = new ArrayList<>();
        numCourses = 0;
    }

    public void addCourse(DTSCourse course) {
        courses.add(course);
        numCourses++;
        System.out.println("Course added successfully.");
    }

    public void displayCourses() {
        if (numCourses == 0) {
            System.out.println("No courses in DTS-Batch! Empty!");
        } else {
            System.out.println("Courses in the DTS-Batch are : ");
            for (int i = 0; i < numCourses; i++) {
                System.out.println("Course " + (i + 1) + " : ");
                courses.get(i).displayInfo();
                System.out.println();
            }
        }
    }
    
    public void searchCourse(String name) {
        boolean found = false;
        for (DTSCourse course : courses) {
            if (course.getName().equalsIgnoreCase(name)) {
                System.out.println("Course found : ");
                course.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found !");
        }
    }

    public void deleteCourse(String name) {
        for (int i = 0; i < numCourses; i++) {
            if (courses.get(i).getName().equalsIgnoreCase(name)) {
                courses.remove(i);
                numCourses--;
                System.out.println("Course deleted successfully!");
                return;
            }
        }
        System.out.println("Course not found!");
    }

    public void enrollForCourse(String name) {
        for (DTSCourse course : courses) {
            if (course.getName().equalsIgnoreCase(name) && course.isAvailable() && !course.isFull()) {
                course.setAvailable(false);
                System.out.println("Enrolled for the course successfully!");
                return;
            }
        }
        System.out.println("Course not available or not found!");
    }

    public void reserveCourse(String name) {
        for (DTSCourse course : courses) {
            if (course.getName().equalsIgnoreCase(name)) {
                if (!course.isAvailable()) {
                    System.out.println("Can not reserve a seat for this course!");
                    return;
                }
                course.setFull(true);
                course.setAvailable(false);
                System.out.println("Reserved a seat for the course successfully!");
                return;
            }
        }
        System.out.println("Course not found.");
    }
    
    public void cancelReservation(String name) {
        for (DTSCourse course : courses) {
            if (course.getName().equalsIgnoreCase(name) && course.isFull()) {
                course.setFull(false);
                if (!course.isAvailable()) {
                    course.setAvailable(true);
                    System.out.println("Reservation cancelled. Course is now Avialable for enrollment!");
                } else {
                    System.out.println("Reservation cancelled!");
                }
                return;
            }
        }
        System.out.println("Course not found or not reserved!");
    }

    public void completeCourse(String name) {
        for (DTSCourse course : courses) {
            if (course.getName().equalsIgnoreCase(name) && !course.isAvailable()) {
                course.setAvailable(true);
                System.out.println("Course completed successfully.");
                return;
            }
        }
        System.out.println("Course not found or already completed!");
    }
}
