package PersistanceLayer.DTOs;

import java.util.LinkedList;

/**
 * Created by Ioan on 3/27/2018.
 */
public class ProfileDTO {
    private String profileID;
    private String studentID;
    private String group;
    private LinkedList<CourseDTO> currentCourses;

    public ProfileDTO() {
    }

    public ProfileDTO(String profileID, String studentID, String group, LinkedList<CourseDTO> currentCourses) {
        this.profileID = profileID;
        this.studentID = studentID;
        this.group = group;
        this.currentCourses = currentCourses;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCurrentCourses(LinkedList<CourseDTO> currentCourses) {
        this.currentCourses = currentCourses;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getGroup() {
        return group;
    }

    public LinkedList<CourseDTO> getCurrentCourses() {
        return currentCourses;
    }
}
