package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.StudentViews.EnrollView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnrollController {

    private Student student;
    private StudentBLL studentBLL;

    private EnrollView enrollView;

    public EnrollController(Student student) {
        this.student = student;
        this.studentBLL = new StudentBLL();
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            enrollView.setVisible(false);
            StudentController studentController = new StudentController(student);
        }
    }
}
