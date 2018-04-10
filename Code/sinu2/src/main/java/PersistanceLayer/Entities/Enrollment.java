package PersistanceLayer.Entities;

import java.sql.Date;

public class Enrollment {

    private String studentID;
    private String courseID;
    private Long mark;
    private String status;
    private String courseName;
    private String teacherName;
    private Date startDate;
    private Date endDate;

    public Enrollment(Long mark, String status, String profileID, String courseID) {
        this.status = status;
        this.mark = mark;
        this.studentID = profileID;
        this.courseID = courseID;
    }

    public Enrollment(String courseName, String teacherName, Date startDate, Date endDate, String status, Long mark) {
        this.mark = mark;
        this.status = status;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "mark=" + mark +
                ", status='" + status + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
