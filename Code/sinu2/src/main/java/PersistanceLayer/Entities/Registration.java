package PersistanceLayer.Entities;

public class Registration {
    private Long examID;
    private Long studentID;
    private String status;

    private String courseName;
    private Long grade;

    public Registration(String courseName, Long grade, String status) {
        this.status = status;
        this.courseName = courseName;
        this.grade = grade;
    }

    public Long getExamID() {
        return examID;
    }

    public void setExamID(Long examID) {
        this.examID = examID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }
}
