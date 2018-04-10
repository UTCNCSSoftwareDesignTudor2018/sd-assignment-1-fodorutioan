package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.*;
import PersistanceLayer.Entities.*;
import PresentationLayer.Views.StudentViews.EnrollView;
import PresentationLayer.Views.StudentViews.ExamRegisterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ExamRegisterController {

    private Student student;
    private RegistrationBLL registrationBLL;
    private ExamBLL examBLL;

    private ExamRegisterView examRegisterView;

    public ExamRegisterController(Student student) {
        this.student = student;
        this.registrationBLL = new RegistrationBLL();
        this.examBLL = new ExamBLL();
        initialize();
    }


    public void initialize() {
        LinkedList<Exam> examsToTake = examBLL.selectExamsNotTakenBy(student.getStudentID());
        LinkedList<Registration> registrations = registrationBLL.selectByStudentID(student.getStudentID());
        System.out.println("Exams to enroll: " + examsToTake);
        System.out.println("Registrations: " + registrations);
        this.examRegisterView = new ExamRegisterView(examsToTake, registrations);
        this.examRegisterView.addBackButtonListener(new BackButtonListener());
        this.examRegisterView.addRegisterButtonListener(new RegisterButtonListener());
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            examRegisterView.setVisible(false);
            StudentController studentController = new StudentController(student);
        }
    }


    public class RegisterButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (registrationBLL.registerStudentForExam(student.getStudentID(), examRegisterView.getSelectedExam())) {
                examRegisterView.dispose();
                initialize();
                examRegisterView.setRegistrationStatus("You registered for the exam successfully!");
            } else {
                examRegisterView.setRegistrationStatus("Error registering for exam!");
            }
        }

    }

}



