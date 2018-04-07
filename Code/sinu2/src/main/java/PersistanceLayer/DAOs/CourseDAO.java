package PersistanceLayer.DAOs;

import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Student;
import Utils.ConnectionFactory;
import Utils.SQLQueryBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class CourseDAO {

    public CourseDAO() {
    }

    public LinkedList<Course> selectCoursesNotTaken(Long studentID) {
        LinkedList<Course> courses = null;
        LinkedList<Course> courses2 = null;
        PreparedStatement statement = null;
        PreparedStatement statement2 = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {


            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "SELECT courses.* from courses INNER JOIN enrollments ON courses.id = enrollments.course_id WHERE student_id =?");
            statement.setLong(1, studentID);
            System.out.println(statement);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                courses.add(new Course(
                        resultSet.getLong(1),
                        "curs",
                        resultSet.getDate(3),
                        resultSet.getDate(4),
                        resultSet.getLong(2)));
            }

            statement2 = connection.prepareStatement(
                    "SELECT * from courses");
            System.out.println(statement2);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                courses2.add(new Course(
                        resultSet.getLong(1),
                        "curs",
                        resultSet.getDate(3),
                        resultSet.getDate(4),
                        resultSet.getLong(2)));
            }

            for (Course c: courses) {
                courses2.remove(c);
            }
            return courses2;
        } catch (SQLException e) {
            System.out.println("Course error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return courses;
    }

}
