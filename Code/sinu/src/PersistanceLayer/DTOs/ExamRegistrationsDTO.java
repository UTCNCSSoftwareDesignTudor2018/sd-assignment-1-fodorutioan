package PersistanceLayer.DTOs;

public class ExamRegistrationsDTO {
    private String examRegistrationsID;
    private String profileID;
    private String examID;

    public ExamRegistrationsDTO(String examRegistrationsID, String profileID, String examID) {
        this.examRegistrationsID = examRegistrationsID;
        this.profileID = profileID;
        this.examID = examID;
    }

    public String getExamRegistrationsID() {
        return examRegistrationsID;
    }

    public void setExamRegistrationsID(String examRegistrationsID) {
        this.examRegistrationsID = examRegistrationsID;
    }

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }
}
