package PresentationLayer.Views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JButton teacherLogInButton;
    private JButton studentLogInButton;
    private JPasswordField password;
    private JTextField username;
    private JPanel backPanel;

    public LoginView() {
        this.setContentPane(backPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public void addStudentLogInListener(ActionListener listenForStudentLogInButton) {
        studentLogInButton.addActionListener(listenForStudentLogInButton);
    }

    public void addTeacherLogInListener(ActionListener listenForTeacherLogInButton) {
        teacherLogInButton.addActionListener(listenForTeacherLogInButton);
    }

    public String getPassword() {
        return new String(password.getPassword());
    }

    public String getUsername() {
        return username.getText();
    }

}
