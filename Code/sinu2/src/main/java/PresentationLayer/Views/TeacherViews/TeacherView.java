package PresentationLayer.Views.TeacherViews;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TeacherView extends JFrame {
    private JButton editStudentButton;
    private JButton generateReportButton;
    private JPanel backPanel;
    private JLabel logo;

    public TeacherView() {
        this.setContentPane(backPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void addEditStudentButtonListener(ActionListener listenForEditStudentButton) {
        editStudentButton.addActionListener(listenForEditStudentButton);
    }

    public void addGenerateReportButtonListener(ActionListener listenForGenerateReportButton) {
        generateReportButton.addActionListener(listenForGenerateReportButton);
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
