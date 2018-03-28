package PersistanceLayer.DTOs;

public class CourseEnrollmentsDTO {
    private String courseEnrollmentsDTO;
    private String profileID;
    private String courseID;

    public CourseEnrollmentsDTO(String courseEnrollmentsDTO, String profileID, String courseID) {
        this.courseEnrollmentsDTO = courseEnrollmentsDTO;
        this.profileID = profileID;
        this.courseID = courseID;
    }

    public String getCourseEnrollmentsDTO() {
        return courseEnrollmentsDTO;
    }

    public void setCourseEnrollmentsDTO(String courseEnrollmentsDTO) {
        this.courseEnrollmentsDTO = courseEnrollmentsDTO;
    }

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
}
