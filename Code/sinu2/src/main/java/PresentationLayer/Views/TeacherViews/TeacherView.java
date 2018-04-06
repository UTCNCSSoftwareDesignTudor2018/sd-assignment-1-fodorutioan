package PresentationLayer.Views.TeacherViews;

import javax.swing.*;

public class TeacherView extends JFrame {
    private JTextArea welcomeTeacherTextArea;
    private JButton editStudentPersonalInformationButton;
    private JButton generateReportButton;
    private JButton registerStudentForExamButton;
    private JPanel backPanel;

    public TeacherView() {
        this.setContentPane(backPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
