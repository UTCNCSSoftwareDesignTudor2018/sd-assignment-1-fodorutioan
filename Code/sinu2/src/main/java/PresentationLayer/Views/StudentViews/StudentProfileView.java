package PresentationLayer.Views.StudentViews;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.valueOf;

public class StudentProfileView extends JFrame {

    private boolean editMode;

    private JButton editProfileButton;
    private JButton saveChangesButton;
    private JButton cancelButton;
    private JLabel publicProfileLabel;
    private JPanel backPanel;

    private JTextField nameTextField;
    //private JTextField IDTextField;
    private JTextField groupTextField;
    private JTextField emailTextField;
    private JTextField CNPtextField;
    private JTextField addressTextField;

    private JLabel newNameLabel;
    //private JLabel newStudentID;
    private JLabel newCNP;
    private JLabel newAddressLabel;
    private JLabel newGroupLabel;
    private JLabel newEmailLabel;

    private JLabel studentIDLabel;
    private JLabel CNPLabel;
    private JLabel addressLabel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel groupLabel;

    private JLabel actualName;
    private JLabel actualStudentIDLabel;
    private JLabel actualCNPLabel;
    private JLabel actualAddressLabel;
    private JLabel actualGroupLabel;
    private JLabel actualEmailLabel;
    private JLabel status;
    private JButton backButton;
    private JLabel logo;

    public StudentProfileView() {

        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.saveChangesButton.setVisible(false);
        this.cancelButton.setVisible(false);

        this.newNameLabel.setVisible(false);
        //this.newStudentID.setVisible(false);
        this.newAddressLabel.setVisible(false);
        this.newEmailLabel.setVisible(false);
        this.newCNP.setVisible(false);
        this.newGroupLabel.setVisible(false);

        this.status.setVisible(false);

        this.nameTextField.setVisible(false);
        //this.IDTextField.setVisible(false);
        this.groupTextField.setVisible(false);
        this.emailTextField.setVisible(false);
        this.CNPtextField.setVisible(false);
        this.addressTextField.setVisible(false);

        editMode = false;
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    public void toggleEditProfileMode() {

        if (!editMode) {

            this.saveChangesButton.setVisible(true);
            this.cancelButton.setVisible(true);

            this.newNameLabel.setVisible(true);
            //this.newStudentID.setVisible(true);
            this.newAddressLabel.setVisible(true);
            this.newEmailLabel.setVisible(true);
            this.newCNP.setVisible(true);
            this.newGroupLabel.setVisible(true);

            this.nameTextField.setVisible(true);
            //this.IDTextField.setVisible(true);
            this.groupTextField.setVisible(true);
            this.emailTextField.setVisible(true);
            this.CNPtextField.setVisible(true);
            this.addressTextField.setVisible(true);

            this.status.setVisible(true);
            this.status.setText("Complete all fields for a successful modification.");
            editMode = true;

        } else {

            this.saveChangesButton.setVisible(false);
            this.cancelButton.setVisible(false);

            this.newNameLabel.setVisible(false);
            //this.newStudentID.setVisible(false);
            this.newAddressLabel.setVisible(false);
            this.newEmailLabel.setVisible(false);
            this.newCNP.setVisible(false);
            this.newGroupLabel.setVisible(false);

            this.nameTextField.setVisible(false);
            //this.IDTextField.setVisible(false);
            this.groupTextField.setVisible(false);
            this.emailTextField.setVisible(false);
            this.CNPtextField.setVisible(false);
            this.addressTextField.setVisible(false);

            editMode = false;
        }
    }

    public void addEditProfileButtonListener(ActionListener listenForEditProfileButton) {
        editProfileButton.addActionListener(listenForEditProfileButton);
    }

    public void addSaveChangesButtonListener(ActionListener listenForSaveChangesButton) {
        saveChangesButton.addActionListener(listenForSaveChangesButton);
    }

    public void addBackButtonListener(ActionListener listenForBackButton) {
        backButton.addActionListener(listenForBackButton);
    }

    public void addCancelButtonListener(ActionListener listenForCancelButton) {
        cancelButton.addActionListener(listenForCancelButton);
    }

    public void setActualName(String actualName) {
        this.actualName.setText(actualName);
        this.nameTextField.setText(actualName);
    }

    public void setActualStudentIDLabel(String actualStudentIDLabel) {
        this.actualStudentIDLabel.setText(actualStudentIDLabel);
        //this.IDTextField.setText(actualStudentIDLabel);
    }

    public void setActualCNPLabel(String actualCNPLabel) {
        this.actualCNPLabel.setText(actualCNPLabel);
        this.CNPtextField.setText(actualCNPLabel);
    }

    public void setActualAddressLabel(String actualAddressLabel) {
        this.actualAddressLabel.setText(actualAddressLabel);
        this.addressTextField.setText(actualAddressLabel);
    }

    public void setActualGroupLabel(String actualGroupLabel) {
        this.actualGroupLabel.setText(actualGroupLabel);
        this.groupTextField.setText(actualGroupLabel);
    }

    public void setActualEmailLabel(String actualEmailLabel) {
        this.actualEmailLabel.setText(actualEmailLabel);
        this.emailTextField.setText(actualEmailLabel);
    }

    public void setStatus(String status) {
        this.status.setText(status);
    }

    public String getName() {
        return nameTextField.getText();
    }

    public Long getID() {
        //System.out.println(studentIDLabel.getText());
        return Long.parseLong(actualStudentIDLabel.getText());
    }

    public String getGroup() {
        return groupTextField.getText();
    }

    public String getEmail() {
        return emailTextField.getText();
    }

    public String getCNP() {
        return CNPtextField.getText();
    }

    public String getAddress() {
        System.out.println(addressTextField.getText());
        return addressTextField.getText();
    }

    private void createUIComponents() {
        this.logo = new JLabel();
        ImageIcon imageIcon = new ImageIcon("/home/ioan/Documents/An_3/Semestrul_2/SD/Assignments/A1/sd-assignment-1-fodorutioan/Code/sinu2/src/main/java/PresentationLayer/Views/UTCN_2_EN.png");
        Image img = imageIcon.getImage();
        Image imgr = img.getScaledInstance(imageIcon.getIconWidth()/3,imageIcon.getIconHeight()/3, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(imgr);
        this.logo.setIcon(imageIcon);
    }
}
