package PersistanceLayer.DTOs;

public class GradeDTO {
    private String gradeID;
    private String profileID;
    private String examID;
    private int mark;


    public GradeDTO() {
    }

    public GradeDTO(String gradeID, String profileID, String examID, int mark) {
        this.gradeID = gradeID;
        this.profileID = profileID;
        this.examID = examID;
        this.mark = mark;
    }

    public String getGradeID() {
        return gradeID;
    }

    public void setGradeID(String gradeID) {
        this.gradeID = gradeID;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
