package DTSPackages;

public class DTSCourse {
    private String name;
    private String tutor;
    private int numHrs;
    private boolean isAvailable;
    private boolean isfull;

    public DTSCourse(String name, String tutor, int numHrs) {
        this.name = name;
        this.tutor = tutor;
        this.numHrs = numHrs;
        this.isAvailable = true;
        this.isfull = false;
    }

    public String getName() {
        return name;
    }

    public String getTutor() {
        return tutor;
    }

    public int getNumHrs() {
        return numHrs;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isFull() {
        return isfull;
    }

    public void setFull(boolean full) {
        isfull = full;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Tutor : " + tutor);
        System.out.println("Num of Hrs : " + numHrs);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Reserved: " + (isfull ? "Yes" : "No"));
    }
}