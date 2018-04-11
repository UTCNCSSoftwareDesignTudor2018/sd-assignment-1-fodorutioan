package PersistanceLayer.DAOs;

import PersistanceLayer.Entities.Student;
import Utils.ConnectionFactory;
import Utils.SQLQueryBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import static Utils.SQLQueryBuilder.*;

/**
 * Created by Ioan on 3/27/2018.
 */
public class StudentDAO {

    public StudentDAO() {
    }

    //    public LinkedList<Student> findAll() {
//        PreparedStatement statement = null;
//        ResultSet rs = null;
//        Connection connection = null;
//        String query = "SELECT * FROM students";
//        try {
//            connection = ConnectionFactory.getConnection();
//            statement = connection.prepareStatement(query);
//            //statement.setInt(1, id);
//            System.out.println(statement + "\n");
//            rs = statement.executeQuery();
//            List<Student> studentDTOList =
//
//
//        } catch (SQLException e) {
//            System.out.println("Exception!");
//        } finally {
//            ConnectionFactory.close(rs);
//            ConnectionFactory.close(statement);
//            ConnectionFactory.close(connection);
//        }
//    }

    public LinkedList<Student> selectAll() {
        LinkedList<Student> allStudents = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "SELECT * FROM students");
            System.out.println(statement);
            resultSet = statement.executeQuery();
            allStudents = new LinkedList<Student>();
            while (resultSet.next()) {
                Student s = new Student(
                        resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8));
                allStudents.add(s);
            }
            return allStudents;
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Student error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return allStudents;

    }

    public Student selectStudentByUserName(String username) {
        Student student = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        String query = createSelect("students", "user", username);
        System.out.println(query);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                student = (new Student(
                        resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8)
                ));
            }
        } catch (SQLException e) {
            System.out.println("Login error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return student;
    }

    public Student selectStudentByID(Long studentID) {
        Student student = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        String query = createSelect("students", "id", studentID.toString());
        System.out.println(query);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                student = (new Student(
                        resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8)
                ));
            }
        } catch (SQLException e) {
            System.out.println("Login error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return student;
    }


    public boolean update(String name, String address, String CNP, String email, String group, Long ID) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "UPDATE students SET name =?, address =?, CNP =?, email =?, study_group =? WHERE id =?");
            statement.setString(1, name);
            statement.setString(2, address);
            statement.setString(3, CNP);
            statement.setString(4, email);
            statement.setString(5, group);
            statement.setLong(6, ID);
            System.out.println(statement);
            if (statement.executeUpdate() > 0) {
                System.out.println("Update successful!");
                return true;
            } else {
                System.out.println("Update failed!");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Update Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return false;
    }
    }
