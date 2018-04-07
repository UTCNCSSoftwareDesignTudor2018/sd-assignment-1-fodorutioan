package PresentationLayer.Views.StudentViews;

import PersistanceLayer.Entities.Course;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class EnrollView extends JFrame {
    private JPanel backPanel;
    private JLabel enrollLabel;
    private JButton backButton;
    private JComboBox dropDown;
    private JButton enrollButton;

    public EnrollView(LinkedList<Course> courses) {
        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.dropDown = new JComboBox(new DefaultComboBoxModel(courses.toArray()));
    }

    public void addBackButtonListener(ActionListener listenForBackButton) {
        backButton.addActionListener(listenForBackButton);
    }

    private void createUIComponents() {

    }

}
