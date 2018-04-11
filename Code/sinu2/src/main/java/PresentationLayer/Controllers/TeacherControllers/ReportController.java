package PresentationLayer.Controllers.TeacherControllers;
import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PersistanceLayer.Entities.Teacher;
import PresentationLayer.Views.TeacherViews.ReportView;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReportController {

    private ReportView reportView;
    private StudentBLL studentBLL;
    private Teacher teacher;

    public ReportController(Student student, Teacher teacher) {
        this.teacher = teacher;
        this.studentBLL = new StudentBLL();
        this.reportView = new ReportView(studentBLL.generateReport(student.getStudentID()));
        this.reportView.addBackButtonListener(new BackButtonListener());

    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            reportView.setVisible(false);
            SelectStudentController selectStudentController = new SelectStudentController(2, teacher);
        }
    }

}
