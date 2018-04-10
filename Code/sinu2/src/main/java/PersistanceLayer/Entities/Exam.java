package PersistanceLayer.Entities;

import java.sql.Date;
import java.util.Objects;

/**
 * Created by Ioan on 3/27/2018.
 */
public class Exam {

    private Long examID;
    private Long courseID;
    private String room;
    private Date date;
    private String courseName;

    public Exam(Long examID, Long courseID, String room, Date date) {
        this.examID = examID;
        this.courseID = courseID;
        this.room = room;
        this.date = date;
    }

    public Exam(Long examID, String room, Date date, String courseName) {
        this.examID = examID;
        this.room = room;
        this.date = date;
        this.courseName = courseName;
    }

    public Long getExamID() {
        return examID;
    }

    public void setExamID(Long examID) {
        this.examID = examID;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return Objects.equals(examID, exam.examID);
    }

    @Override
    public int hashCode() {

        return Objects.hash(examID);
    }
}
