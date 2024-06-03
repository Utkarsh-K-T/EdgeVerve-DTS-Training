public class PlacementOrFurtherEducation {
    private String studentName;
    private boolean placed;
    private String furtherEducationInstitute;

    public PlacementOrFurtherEducation(String studentName, boolean placed, String furtherEducationInstitute) {
        this.studentName = studentName;
        this.placed = placed;
        this.furtherEducationInstitute = furtherEducationInstitute;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    public String getFurtherEducationInstitute() {
        return furtherEducationInstitute;
    }

    public void setFurtherEducationInstitute(String furtherEducationInstitute) {
        this.furtherEducationInstitute = furtherEducationInstitute;
    }
}
