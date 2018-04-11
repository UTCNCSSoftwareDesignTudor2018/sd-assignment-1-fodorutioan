package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import BussinessLayer.BussinessLogic.TeacherBLL;
import PersistanceLayer.Entities.Student;
import PersistanceLayer.Entities.Teacher;
import PresentationLayer.Controllers.StudentControllers.StudentController;
import PresentationLayer.Controllers.TeacherControllers.TeacherController;
import PresentationLayer.Views.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    private LoginView loginView;
    private TeacherController teacherController;
    private StudentController studentController;
    private StudentBLL studentBLL;
    private TeacherBLL teacherBLL;

    public LoginController() {
        loginView = new LoginView();
        loginView.setVisible(true);
        loginView.addStudentLogInListener(new StudentLogInListener());
        loginView.addTeacherLogInListener(new TeacherLogInListener());
    }


    public class StudentLogInListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentBLL = new StudentBLL();
            Student student = studentBLL.logIn(loginView.getUsername(), loginView.getPassword());
            if (student != null) {
                loginView.setVisible(false);
                studentController = new StudentController(student);
            }
        }
    }

    public class TeacherLogInListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            teacherBLL = new TeacherBLL();
            Teacher teacher = teacherBLL.logIn(loginView.getUsername(), loginView.getPassword());
            if (teacher != null) {
                loginView.setVisible(false);
                teacherController = new TeacherController(teacher);
            }
        }
    }
}