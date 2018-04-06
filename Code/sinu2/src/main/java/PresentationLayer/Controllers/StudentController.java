package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.StudentViews.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {

    private Student student;
    private StudentBLL studentBLL;
    private StudentView studentView;
    private StudentProfileController studentProfileController;

    public StudentController(Student student) {
        studentView = new StudentView();
        this.student = student;
        this.studentBLL = new StudentBLL();
        studentView.addPublicProfileButtonListener(new PublicProfileButtonListener());
    }

    public class PublicProfileButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentProfileController = new StudentProfileController(student);
        }
    }

}
