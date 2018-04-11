package PresentationLayer.Controllers.TeacherControllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PersistanceLayer.Entities.Teacher;
import PresentationLayer.Controllers.StudentControllers.StudentController;
import PresentationLayer.Controllers.TeacherControllers.EditStudentController;
import PresentationLayer.Controllers.TeacherControllers.ReportController;
import PresentationLayer.Views.TeacherViews.SelectStudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class SelectStudentController {
    private SelectStudentView selectStudentView;
    private EditStudentController editStudentController;
    private ReportController generateReportController;
    private int mode;
    private Teacher teacher;
    private StudentBLL studentBLL;

    public SelectStudentController(int mode, Teacher teacher) {
        this.studentBLL = new StudentBLL();
        this.mode = mode;
        this.teacher = teacher;
        initialize();
    }

    public void initialize() {
        LinkedList<Student> students = studentBLL.selectAll();
        this.selectStudentView = new SelectStudentView(students);
        selectStudentView.addBackButtonListener(new BackButtonListener());
        selectStudentView.addButtonListener(new ButtonListener());
        if (mode == 1) {
            selectStudentView.setButtonText("Edit student information");
        } else {
            selectStudentView.setButtonText("Generate report");
        }
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            selectStudentView.setVisible(false);
            TeacherController teacherController = new TeacherController(teacher);
        }
    }

    public class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            selectStudentView.setVisible(false);
            Student student = studentBLL.selectStudentByID(selectStudentView.getSelectedStudent());
            if (mode == 1) {
                EditStudentController editStudentController = new EditStudentController(student, teacher);
            } else {
                ReportController reportController = new ReportController(student, teacher);
            }
        }

    }
}
