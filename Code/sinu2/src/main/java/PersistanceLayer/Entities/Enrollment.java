package PersistanceLayer.Entities;

public class Enrollment {

    private String studentID;
    private String courseID;
    private int mark;
    private String status;

    public Enrollment(int mark, String status, String profileID, String courseID) {
        this.status = status;
        this.mark = mark;
        this.studentID = profileID;
        this.courseID = courseID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String profileID) {
        this.studentID = profileID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
}
