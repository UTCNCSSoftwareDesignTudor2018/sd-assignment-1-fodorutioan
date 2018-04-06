package PresentationLayer.Controllers;

import BussinessLayer.BussinessLogic.StudentBLL;
import PersistanceLayer.Entities.Student;
import PresentationLayer.Views.StudentViews.StudentProfileView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentProfileController {

    private Student student;
    private StudentBLL studentBLL;

    private StudentProfileView studentProfileView;

    public StudentProfileController(Student student) {
        this.student = student;
        this.studentBLL = new StudentBLL();
        studentProfileView = new StudentProfileView();
        studentProfileView.setVisible(true);
        studentProfileView.addSaveChangesButtonListener(new SaveChangesButtonListener());
        studentProfileView.addEditProfileButtonListener(new EditProfileButtonListener());
        studentProfileView.addCancelButtonListener(new CancelButtonListener());
        studentProfileView.addBackButtonListener(new BackButtonListener());
        studentProfileView.setActualName(student.getName());
        studentProfileView.setActualStudentIDLabel(String.valueOf(student.getStudentID()));
        studentProfileView.setActualAddressLabel(student.getAddress());
        studentProfileView.setActualCNPLabel(student.getCNP());
        studentProfileView.setActualEmailLabel(student.getEmail());
        studentProfileView.setActualGroupLabel(student.getGroup());
    }

    public class SaveChangesButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String name = studentProfileView.getName();
            String address = studentProfileView.getAddress();
            String CNP = studentProfileView.getCNP();
            String email = studentProfileView.getEmail();
            String group = studentProfileView.getGroup();
            Long ID = studentProfileView.getID();

            if (studentBLL.update(name, address, CNP, email, group, ID)) {
                studentProfileView.toggleEditProfileMode();

                studentProfileView.setActualName(name);
                studentProfileView.setActualAddressLabel(address);
                studentProfileView.setActualCNPLabel(CNP);
                studentProfileView.setActualEmailLabel(email);
                studentProfileView.setActualGroupLabel(group);
                studentProfileView.setActualStudentIDLabel(ID.toString());

                studentProfileView.setStatus("Update successful!");

                student.setName(name);
                student.setAddress(address);
                student.setCNP(CNP);
                student.setEmail(email);
                student.setGroup(group);
                student.setStudentID(ID);
            } else {
                studentProfileView.setStatus("Invalid data!");
            }

        }
    }

    public class EditProfileButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentProfileView.toggleEditProfileMode();
        }
    }

    public class CancelButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentProfileView.toggleEditProfileMode();
        }
    }

    public class BackButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            studentProfileView.setVisible(false);
        }
    }

}
