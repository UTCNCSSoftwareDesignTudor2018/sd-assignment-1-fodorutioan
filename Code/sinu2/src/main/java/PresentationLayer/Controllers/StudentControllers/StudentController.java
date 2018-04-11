package PresentationLayer.Controllers.StudentControllers;

import PersistanceLayer.Entities.Student;
import PresentationLayer.Controllers.StudentControllers.EnrollController;
import PresentationLayer.Controllers.StudentControllers.ExamRegisterController;
import PresentationLayer.Controllers.StudentControllers.StudentProfileController;
import PresentationLayer.Views.StudentViews.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {

    private Student student;
    private StudentView studentView;
    private StudentProfileController studentProfileController;
    private EnrollController enrollController;
    private ExamRegisterController examRegisterController;

    public StudentController(Student student) {
        studentView = new StudentView();
        this.student = student;
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
