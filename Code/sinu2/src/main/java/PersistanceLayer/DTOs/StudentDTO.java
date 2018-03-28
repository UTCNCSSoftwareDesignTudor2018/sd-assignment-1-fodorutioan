package PersistanceLayer.DTOs;

/**
 * Created by Ioan on 3/27/2018.
 */
public class StudentDTO {

    private String studentID;
    private String name;
    private String CNP;
    private String address;
    private String email;
    private String profileID;

    public StudentDTO() {
    }

    public StudentDTO(String studentID, String name, String CNP, String address, String email, String profileID) {
        this.studentID = studentID;
        this.name = name;
        this.CNP = CNP;
        this.address = address;
        this.email = email;
        this.profileID = profileID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getProfileID() {
        return profileID;
    }
}
