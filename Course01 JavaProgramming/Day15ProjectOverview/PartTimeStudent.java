public class PartTimeStudent extends Student {
    private boolean isPartTime;

    public PartTimeStudent(String name, int id, CollegeDepartment department, boolean isPartTime) {
        super(name, id, department);
        this.isPartTime = isPartTime;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }
}
