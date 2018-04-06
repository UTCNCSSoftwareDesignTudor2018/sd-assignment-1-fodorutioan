package PersistanceLayer.Entities;

/**
 * Created by Ioan on 3/27/2018.
 */
public class Student {

    private Long studentID;
    private String name;
    private String CNP;
    private String address;
    private String email;
    private String group;
    private String user;
    private String password;

    public Student() {
    }

    public Student(Long studentID, String name, String CNP, String group, String email, String user, String address, String password) {
        this.studentID = studentID;
        this.name = name;
        this.CNP = CNP;
        this.address = address;
        this.email = email;
        this.group = group;
        this.user = user;
        this.password = password;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
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

    public void setGroup(String group) {
        this.group = group;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getGroup() {
        return group;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
