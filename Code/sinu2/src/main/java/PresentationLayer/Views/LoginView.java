package PresentationLayer.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

public class LoginView extends JFrame {
    private JButton teacherLogInButton;
    private JButton studentLogInButton;
    private JPasswordField password;
    private JTextField username;
    private JPanel backPanel;
    private JLabel logo;

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

    private void createUIComponents() {
        this.logo = new JLabel();
        ImageIcon imageIcon = new ImageIcon("/home/ioan/Documents/An_3/Semestrul_2/SD/Assignments/A1/sd-assignment-1-fodorutioan/Code/sinu2/src/main/java/PresentationLayer/Views/UTCN_2_EN.png");
        Image img = imageIcon.getImage();
        Image imgr = img.getScaledInstance(imageIcon.getIconWidth()/2,imageIcon.getIconHeight()/2, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(imgr);
        this.logo.setIcon(imageIcon);
    }
}
