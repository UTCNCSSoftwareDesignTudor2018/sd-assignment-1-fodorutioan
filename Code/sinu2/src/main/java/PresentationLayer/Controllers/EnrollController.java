package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.CourseBLL;
import BussinessLayer.BussinessLogic.EnrollmentBLL;
import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Enrollment;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.StudentViews.EnrollView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class EnrollController {

    private Student student;
    private CourseBLL courseBLL;
    private EnrollmentBLL enrollmentBLL;

    private EnrollView enrollView;

    public EnrollController(Student student) {
        this.student = student;
        this.enrollmentBLL = new EnrollmentBLL();
        this.courseBLL = new CourseBLL();
        initialize();
    }

    public void initialize() {
        LinkedList<Course> courses = courseBLL.selectCoursesNotTakenBy(student.getStudentID());
        LinkedList<Enrollment> enrollments = enrollmentBLL.selectByStudentID(student.getStudentID());
        System.out.println("Courses to enroll: 0" + courses);
        System.out.println("Enrollments: " + enrollments);
        this.enrollView = new EnrollView(courses, enrollments);
        this.enrollView.addBackButtonListener(new BackButtonListener());
        this.enrollView.addEnrollButtonListener(new EnrollButtonListener());
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            enrollView.setVisible(false);
            StudentController studentController = new StudentController(student);
        }
    }

    public class EnrollButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (EnrollmentBLL.enrollStudentToCourse(student.getStudentID(), enrollView.getSelectedCourse())) {
                enrollView.dispose();
                initialize();
                enrollView.setEnrollentStatus("You enrolled the course successfully!");
            } else {
                enrollView.setEnrollentStatus("Error enrolling the course!");
            }
        }
    }
}
