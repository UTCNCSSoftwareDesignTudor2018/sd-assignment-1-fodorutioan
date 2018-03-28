package PersistanceLayer.DTOs;

import java.sql.Date;

/**
 * Created by Ioan on 3/27/2018.
 */
public class ExamDTO {
    private String examID;
    private String courseID;
    private String room;
    private Date date;

    public ExamDTO(String examID, String courseID, String room, Date date) {
        this.examID = examID;
        this.courseID = courseID;
        this.room = room;
        this.date = date;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
