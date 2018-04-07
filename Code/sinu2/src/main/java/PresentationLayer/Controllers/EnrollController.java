package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.CourseBLL;
import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.StudentViews.EnrollView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnrollController {

    private Student student;
    private StudentBLL studentBLL;
    private CourseBLL courseBLL;


    private EnrollView enrollView;

    public EnrollController(Student student) {
        this.student = student;
        this.studentBLL = new StudentBLL();
        this.courseBLL = new CourseBLL();
        this.enrollView = new EnrollView(courseBLL.selectCoursesNotTakenBy(student.getStudentID()));
        this.enrollView.addBackButtonListener(new BackButtonListener());
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            enrollView.setVisible(false);
            StudentController studentController = new StudentController(student);
        }
    }
}
