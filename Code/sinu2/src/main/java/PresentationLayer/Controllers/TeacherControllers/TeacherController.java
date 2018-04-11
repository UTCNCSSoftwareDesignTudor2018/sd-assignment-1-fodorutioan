package PresentationLayer.Controllers.TeacherControllers;

import PersistanceLayer.Entities.Teacher;
import PresentationLayer.Controllers.TeacherControllers.SelectStudentController;
import PresentationLayer.Views.TeacherViews.TeacherView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherController {

    private Teacher teacher;
    private TeacherView teacherView;
    private SelectStudentController selectStudentController;

    public TeacherController(Teacher teacher) {
        this.teacher = teacher;
        this.teacherView = new TeacherView();

        teacherView.addEditStudentButtonListener(new EditStudentButtonListener());
        teacherView.addGenerateReportButtonListener(new GenerateReportButtonListener());
    }

    public class EditStudentButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            teacherView.setVisible(false);
            selectStudentController = new SelectStudentController(1, teacher);
        }
    }

    public class GenerateReportButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            teacherView.setVisible(false);
            selectStudentController = new SelectStudentController(2, teacher);
        }
    }
}
