// Interface Engineer
interface Engineer {
    void work();
}

// SoftwareEngineer Class
class SoftwareEngineer implements Engineer {
    private String name;
    private int experienceYears;
    private String programmingLanguage;

    public SoftwareEngineer(String name, int experienceYears, String programmingLanguage) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " with " + experienceYears + " years of experience is working on " + programmingLanguage + " coding and debugging.");
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{name='" + name + "', experienceYears=" + experienceYears + ", programmingLanguage='" + programmingLanguage + "'}";
    }
}

// HardwareEngineer Class
class HardwareEngineer implements Engineer {
    private String name;
    private int experienceYears;
    private String specializedArea;

    public HardwareEngineer(String name, int experienceYears, String specializedArea) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.specializedArea = specializedArea;
    }

    @Override
    public void work() {
        System.out.println(name + " with " + experienceYears + " years of experience is working on designing and testing circuits in " + specializedArea + ".");
    }

    @Override
    public String toString() {
        return "HardwareEngineer{name='" + name + "', experienceYears=" + experienceYears + ", specializedArea='" + specializedArea + "'}";
    }
}

public class bMainEMS {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Ram", 3, "Java");
        HardwareEngineer hardwareEngineer = new HardwareEngineer("Utkarsh", 6, "Embedded Systems");

        System.out.println(softwareEngineer);
        softwareEngineer.work();

        System.out.println(hardwareEngineer);
        hardwareEngineer.work();
    }
}
