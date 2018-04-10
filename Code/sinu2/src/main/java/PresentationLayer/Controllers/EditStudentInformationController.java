package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.TeacherViews.EditStudentInformationView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditStudentInformationController {

    private Student student;
    private StudentBLL studentBLL;

    private EditStudentInformationView editStudentInformationView;

    EditStudentInformationController(Student student) {
        this.student = student;
        this.studentBLL = new StudentBLL();
        editStudentInformationView = new EditStudentInformationView();
        editStudentInformationView.setVisible(true);
        editStudentInformationView.addSaveChangesButtonListener(new SaveChangesButtonListener());
        editStudentInformationView.addEditProfileButtonListener(new EditProfileButtonListener());
        editStudentInformationView.addCancelButtonListener(new CancelButtonListener());
        editStudentInformationView.addBackButtonListener(new BackButtonListener());
        editStudentInformationView.setActualName(student.getName());
        editStudentInformationView.setActualStudentIDLabel(String.valueOf(student.getStudentID()));
        editStudentInformationView.setActualAddressLabel(student.getAddress());
        editStudentInformationView.setActualCNPLabel(student.getCNP());
        editStudentInformationView.setActualEmailLabel(student.getEmail());
        editStudentInformationView.setActualGroupLabel(student.getGroup());
    }

    public class SaveChangesButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String name = editStudentInformationView.getName();
            String address = editStudentInformationView.getAddress();
            String CNP = editStudentInformationView.getCNP();
            String email = editStudentInformationView.getEmail();
            String group = editStudentInformationView.getGroup();
            Long ID = editStudentInformationView.getID();

            if (studentBLL.update(name, address, CNP, email, group, ID)) {
                editStudentInformationView.toggleEditProfileMode();

                editStudentInformationView.setActualName(name);
                editStudentInformationView.setActualAddressLabel(address);
                editStudentInformationView.setActualCNPLabel(CNP);
                editStudentInformationView.setActualEmailLabel(email);
                editStudentInformationView.setActualGroupLabel(group);
                editStudentInformationView.setActualStudentIDLabel(ID.toString());

                editStudentInformationView.setStatus("Update successful!");

                student.setName(name);
                student.setAddress(address);
                student.setCNP(CNP);
                student.setEmail(email);
                student.setGroup(group);
                student.setStudentID(ID);
            } else {
                editStudentInformationView.setStatus("Invalid data!");
            }

        }
    }

    public class EditProfileButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            editStudentInformationView.toggleEditProfileMode();
        }
    }

    public class CancelButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            editStudentInformationView.toggleEditProfileMode();
        }
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            editStudentInformationView.setVisible(false);
            StudentController studentController = new StudentController(student);
        }
    }
}
