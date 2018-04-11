package PresentationLayer.Controllers.TeacherControllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PersistanceLayer.Entities.Teacher;
import PresentationLayer.Controllers.StudentControllers.StudentController;
import PresentationLayer.Views.TeacherViews.EditStudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditStudentController {

    private Student student;
    private Teacher teacher;
    private StudentBLL studentBLL;

    private EditStudentView editStudentView;

    public EditStudentController(Student student, Teacher teacher) {
        this.teacher = teacher;
        this.student = student;
        this.studentBLL = new StudentBLL();
        editStudentView = new EditStudentView();
        editStudentView.setVisible(true);
        editStudentView.addSaveChangesButtonListener(new SaveChangesButtonListener());
        editStudentView.addEditStudentButtonListener(new EditProfileButtonListener());
        editStudentView.addCancelButtonListener(new CancelButtonListener());
        editStudentView.addBackButtonListener(new BackButtonListener());
        editStudentView.setActualName(student.getName());
        editStudentView.setActualStudentIDLabel(String.valueOf(student.getStudentID()));
        editStudentView.setActualAddressLabel(student.getAddress());
        editStudentView.setActualCNPLabel(student.getCNP());
        editStudentView.setActualEmailLabel(student.getEmail());
        editStudentView.setActualGroupLabel(student.getGroup());
    }

    public class SaveChangesButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String name = editStudentView.getName();
            String address = editStudentView.getAddress();
            String CNP = editStudentView.getCNP();
            String email = editStudentView.getEmail();
            String group = editStudentView.getGroup();
            Long ID = editStudentView.getID();

            if (studentBLL.update(name, address, CNP, email, group, ID)) {
                editStudentView.toggleEditProfileMode();

                editStudentView.setActualName(name);
                editStudentView.setActualAddressLabel(address);
                editStudentView.setActualCNPLabel(CNP);
                editStudentView.setActualEmailLabel(email);
                editStudentView.setActualGroupLabel(group);
                editStudentView.setActualStudentIDLabel(ID.toString());

                editStudentView.setStatus("Update successful!");

                student.setName(name);
                student.setAddress(address);
                student.setCNP(CNP);
                student.setEmail(email);
                student.setGroup(group);
                student.setStudentID(ID);
            } else {
                editStudentView.setStatus("Invalid data!");
            }

        }
    }

    public class EditProfileButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            editStudentView.toggleEditProfileMode();
        }
    }

    public class CancelButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            editStudentView.toggleEditProfileMode();
        }
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            editStudentView.setVisible(false);
            SelectStudentController selectStudentController = new SelectStudentController(1, teacher);
            //TeacherController teacherController = new TeacherController(student);
        }
    }
}
