package PresentationLayer.Views.StudentViews;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentView extends JFrame {

    private JTextArea welcomeStudentTextArea;
    private JButton personalInformationButton;
    private JButton publicProfileButton;
    private JButton enrollCourseButton;
    private JButton registerForExamSessionButton;
    private JPanel backPanel;

    public StudentView() {
        this.setContentPane(backPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void addPersonalInformationButtonListener(ActionListener listenForInformationButton) {
        personalInformationButton.addActionListener(listenForInformationButton);
    }

    public void addPublicProfileButtonListener(ActionListener listenForProfileButton) {
        publicProfileButton.addActionListener(listenForProfileButton);
    }

    public void addEnrollCourseButtonListener(ActionListener listenForEnrollButton) {
        enrollCourseButton.addActionListener(listenForEnrollButton);
    }


}
