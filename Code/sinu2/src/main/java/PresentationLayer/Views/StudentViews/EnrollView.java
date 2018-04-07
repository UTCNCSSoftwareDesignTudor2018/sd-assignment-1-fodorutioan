package PresentationLayer.Views.StudentViews;

import javax.swing.*;
import java.awt.*;

public class EnrollView extends JFrame {
    private JPanel backPanel;
    private JLabel publicProfileLabel;
    private JButton backButton;

    public EnrollView() {
        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);

    }
}
