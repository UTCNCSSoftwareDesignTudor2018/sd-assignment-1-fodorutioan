package PresentationLayer.Views.TeacherViews;

import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Student;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class SelectStudentView extends JFrame {
    private JPanel backPanel;
    private JComboBox dropDown;
    private JButton backButton;
    private JButton button;

    public SelectStudentView(LinkedList<Student> students) {
        for (Student s: students) {
            this.dropDown.addItem(s.getStudentID() + ". " + s.getName());
        }
        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void addBackButtonListener(ActionListener listenForBackButton) {
        backButton.addActionListener(listenForBackButton);
    }

    public void addButtonListener(ActionListener listenForEditStudentButton) {
        button.addActionListener(listenForEditStudentButton);
    }

    public void setButtonText(String text) {
        this.button.setText(text);
    }

    public Long getSelectedStudent() {
        String student = (String) dropDown.getSelectedItem();
        String studentID = student.replaceAll("[^0-9]", "");
        Long ID = Long.parseLong(studentID);
        return ID;
    }
}
