package PersistanceLayer.DAOs;

import PersistanceLayer.Entities.Enrollment;
import Utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class EnrollmentDAO {

    public LinkedList<Enrollment> selectByStudentID(Long studentID) {
        LinkedList<Enrollment> enrollments = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "SELECT courses.name, teachers.name, courses.startDate, courses.endDate, enrollments.status, enrollments.grade from courses INNER JOIN enrollments ON courses.id = enrollments.course_id INNER JOIN teachers ON courses.teacher_id = teachers.id WHERE student_id =?");
            statement.setLong(1, studentID);
            System.out.println(statement);
            resultSet = statement.executeQuery();
            enrollments = new LinkedList<>();
            while (resultSet.next()) {
                Enrollment e = new Enrollment(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getDate(3),
                        resultSet.getDate(4),
                        resultSet.getString(5),
                        resultSet.getLong(6));
                enrollments.add(e);
            }

            System.out.println("Enrollments:" + enrollments);
            return enrollments;
        } catch (SQLException e) {
            System.out.println("Enrollment error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return enrollments;
    }

    public boolean insert(Long studentID, Long courseID) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "INSERT INTO enrollments (course_id, student_id) VALUES (? , ?)");
            statement.setLong(1, courseID);
            statement.setLong(2, studentID);

            System.out.println(statement);
            if (statement.executeUpdate() > 0) {
                System.out.println("Insert successful!");
                return true;
            } else {
                System.out.println("Insert failed!");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Insert Exception!");
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return false;
    }

}
