package PersistanceLayer.Entities;

/**
 * Created by Ioan on 3/27/2018.
 */
public class Teacher {

    private int teacherID;
    private String email;
    private String user;
    private String password;
    private String name;

    public Teacher(int teacherID, String email, String user, String password, String name) {
        this.teacherID = teacherID;
        this.name = name;
        this.email = email;
        this.user = user;
        this.password = password;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
