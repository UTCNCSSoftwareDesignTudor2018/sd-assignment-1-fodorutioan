package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.ExamBLL;
import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.StudentViews.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StudentController {

    private Student student;
    private StudentBLL studentBLL;
    private StudentView studentView;
    private StudentProfileController studentProfileController;
    private EnrollController enrollController;
    private ExamRegisterController examRegisterController;

    StudentController(Student student) {
        studentView = new StudentView();
        this.student = student;
        this.studentBLL = new StudentBLL();
        studentView.addPublicProfileButtonListener(new PublicProfileButtonListener());
        studentView.addEnrollCourseButtonListener(new EnrollButtonListener());
        studentView.addExamRegisterButtonListener(new ExamRegisterButtonListener());
    }

    public class PublicProfileButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentView.setVisible(false);
            studentProfileController = new StudentProfileController(student);
        }
    }

    public class EnrollButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentView.setVisible(false);
            enrollController = new EnrollController(student);
        }
    }

    public class ExamRegisterButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentView.setVisible(false);
            examRegisterController = new ExamRegisterController(student);
        }
    }
}
