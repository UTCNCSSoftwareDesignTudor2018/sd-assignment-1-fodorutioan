package PersistanceLayer.DAOs;

import PersistanceLayer.Entities.Registration;
import Utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class RegistrationDAO {

    public LinkedList<Registration> selectByStudentID(Long studentID) {
        LinkedList<Registration> registrations = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "SELECT courses.name, enrollments.grade, registrations.status from courses INNER JOIN enrollments ON courses.id = enrollments.course_id INNER JOIN exams on exams.course_id = courses.id INNER JOIN registrations ON exams.id = registrations.exam_id WHERE registrations.student_id =? AND enrollments.student_id =?");
            statement.setLong(1, studentID);
            statement.setLong(2, studentID);

            System.out.println(statement);
            resultSet = statement.executeQuery();
            registrations = new LinkedList<>();
            while (resultSet.next()) {
                Registration r = new Registration(
                        resultSet.getString(1),
                        resultSet.getLong(2),
                        resultSet.getString(3));
                registrations.add(r);
            }
            System.out.println("Registrations:" + registrations);
            return registrations;
        } catch (SQLException e) {
            System.out.println("Registration error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return registrations;
    }

    public boolean insert(Long studentID, Long examID) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "INSERT INTO registrations (exam_id, student_id) VALUES (? , ?)");
            statement.setLong(1, examID);
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
