package BussinessLayer.BussinessLogic;

import BussinessLayer.Validators.LogInValidator;
import PersistanceLayer.DAOs.TeacherDAO;
import PersistanceLayer.Entities.Teacher;

/**
 * Created by Ioan on 3/27/2018.
 */
public class TeacherBLL {

    public TeacherBLL() {
    }

    public Teacher logIn(String username, String password) {
        TeacherDAO teacherDAO = new TeacherDAO();
        Teacher teacher = teacherDAO.findTeacherByUserName(username);
        LogInValidator logInValidator = new LogInValidator();
        if (logInValidator.validateTeacherLogIn(teacher, password)) {
            return teacher;
        } else {
            return null;
        }
    }
}
