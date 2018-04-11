package PresentationLayer.Views.TeacherViews;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ReportView extends JFrame {
    private JPanel backPanel;
    private JButton backButton;
    private JTextPane reportPanel;

    public ReportView(String report) {
        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        reportPanel.setText(report);
    }

    public void addBackButtonListener(ActionListener listenForBackButton) {
        backButton.addActionListener(listenForBackButton);
    }
}
