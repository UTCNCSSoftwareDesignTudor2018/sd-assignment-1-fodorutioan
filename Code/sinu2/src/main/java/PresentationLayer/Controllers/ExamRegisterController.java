package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.StudentViews.ExamRegisterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamRegisterController {

    private Student student;
    private StudentBLL studentBLL;

    private ExamRegisterView examRegisterView;

    public ExamRegisterController(Student student) {
        this.student = student;
        this.studentBLL = new StudentBLL();
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            examRegisterView.setVisible(false);
            StudentController studentController = new StudentController(student);
        }
    }

}
