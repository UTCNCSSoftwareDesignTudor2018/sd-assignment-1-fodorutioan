package PersistanceLayer.DTOs;

/**
 * Created by Ioan on 3/27/2018.
 */
public class TeacherDTO {

    private String teacherID;
    private String name;
    private String email;

    public TeacherDTO(String teacherID, String name, String email) {
        this.teacherID = teacherID;
        this.name = name;
        this.email = email;
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
}
