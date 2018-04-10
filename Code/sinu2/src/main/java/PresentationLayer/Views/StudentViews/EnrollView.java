package PresentationLayer.Views.StudentViews;

import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Enrollment;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class EnrollView extends JFrame {

    private JPanel backPanel;
    private JLabel enrollLabel;
    private JButton backButton;
    private JComboBox dropDown;
    private JButton enrollButton;
    private JLabel enrollmentStatus;
    private JList enrolledList;
    private JTable enrollmentsTable;

    public EnrollView(LinkedList<Course> notTakenCourses, LinkedList<Enrollment> enrollments) {

        for (Course c: notTakenCourses) {
            this.dropDown.addItem(c.getCourseID() + ". " + c.getCourseName());
        }
        Enrollment[] enrolls = new Enrollment[ enrollments.size() ];
        enrollments.toArray(enrolls);
        //enrolledList.setListData(enrolls);
        Object columnNames[] = { "Course ID", "Course", "Teacher", "Grade", "Status", "Start date", "End date" };
        enrollmentsTable.addColumn(new TableColumn() );
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (Enrollment e: enrollments) {
            Object rowData[] = {
                    e.getCourseID(),
                    e.getCourseName(),
                    e.getTeacherName(),
                    e.getMark(),
                    e.getStatus(),
                    e.getStartDate(),
                    e.getEndDate()};
            model.addRow(rowData);
        }
        enrollmentsTable.setModel(model);

        this.setContentPane(backPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void addBackButtonListener(ActionListener listenForBackButton) {
        backButton.addActionListener(listenForBackButton);
    }

    public void addEnrollButtonListener(ActionListener listenForEnrollButton) {
        enrollButton.addActionListener(listenForEnrollButton);
    }

    public Long getSelectedCourse() {
        String course = (String) dropDown.getSelectedItem();
        String courseID = course.replaceAll("[^0-9]", "");
        Long ID = Long.parseLong(courseID);
        return ID;
    }

    public void setEnrollentStatus(String enrollmentStatus) {
        this.enrollmentStatus.setText(enrollmentStatus);
    }
}
