package PresentationLayer.Views.StudentViews;


import javax.swing.*;
import java.awt.event.ActionListener;

public class ExamRegisterView extends JFrame {

    private JPanel backPanel;
    private JLabel registerLabel;
    private JButton backButton;

    public ExamRegisterView() {
        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    public void addBackButtonListener(ActionListener listenForBackButton) {
        backButton.addActionListener(listenForBackButton);
    }
}
