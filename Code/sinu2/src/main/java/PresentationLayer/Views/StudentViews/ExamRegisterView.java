package PresentationLayer.Views.StudentViews;


import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Enrollment;
import PersistanceLayer.Entities.Exam;
import PersistanceLayer.Entities.Registration;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ExamRegisterView extends JFrame {

    private JPanel backPanel;
    private JLabel registerLabel;
    private JButton backButton;
    private JTable examRegistrationsTable;
    private JComboBox dropDown;
    private JButton registerButton;
    private JLabel registerStatus;

    public ExamRegisterView(LinkedList<Exam> examsToTake, LinkedList<Registration> registrations) {

        for (Exam e: examsToTake) {
            this.dropDown.addItem(e.getExamID() + ". " + e.getCourseName());
        }
        Registration[] regis = new Registration[ registrations.size() ];
        registrations.toArray(regis);
        //enrolledList.setListData(enrolls);
        Object columnNames[] = { "Course", "Grade", "Status"};
        examRegistrationsTable.addColumn(new TableColumn() );
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (Registration r: registrations) {
            Object rowData[] = {
                    r.getCourseName(),
                    r.getGrade(),
                    r.getStatus()};
            model.addRow(rowData);
        }
        examRegistrationsTable.setModel(model);
        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    public void addBackButtonListener(ActionListener listenForBackButton) {
        backButton.addActionListener(listenForBackButton);
    }

    public void addRegisterButtonListener(ActionListener listenForEnrollButton) {
        registerButton.addActionListener(listenForEnrollButton);
    }

    public Long getSelectedExam() {
        String exam = (String) dropDown.getSelectedItem();
        String examID = exam.replaceAll("[^0-9]", "");
        Long ID = Long.parseLong(examID);
        return ID;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registerStatus.setText(registrationStatus);
    }
}
