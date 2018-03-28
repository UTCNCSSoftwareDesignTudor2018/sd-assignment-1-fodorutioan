package PersistanceLayer.DTOs;

import java.sql.Date;

/**
 * Created by Ioan on 3/27/2018.
 */
public class CourseDTO {
    private String courseID;
    private Date startDate;
    private Date endDate;
    private String teacherID;

    public CourseDTO(String courseID, Date startDate, Date endDate, String teacherID) {
        this.courseID = courseID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacherID = teacherID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
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

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
}
