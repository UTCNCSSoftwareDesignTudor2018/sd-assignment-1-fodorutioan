package PersistanceLayer.DAOs;

import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Student;
import Utils.ConnectionFactory;
import Utils.SQLQueryBuilder;

import javax.crypto.Cipher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class CourseDAO {

    public CourseDAO() {
    }

    public LinkedList<Course> selectCoursesNotTaken(Long studentID) {
        LinkedList<Course> coursesTaken = null;
        LinkedList<Course> allCourses = null;
        LinkedList<Course> coursesNotTaken = null;
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
            coursesTaken = new LinkedList<Course>();
            while (resultSet.next()) {
                Course c = new Course(
                        resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getDate(4),
                        resultSet.getDate(5),
                        resultSet.getLong(3));
                coursesTaken.add(c);
            }

            statement2 = connection.prepareStatement(
                    "SELECT * from courses");
            System.out.println(statement2);
            resultSet = statement2.executeQuery();
            allCourses = new LinkedList<Course>();
            while (resultSet.next()) {
                Course c2 = new Course(
                        resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getDate(4),
                        resultSet.getDate(5),
                        resultSet.getLong(3));
                allCourses.add(c2);
            }

            coursesNotTaken = new LinkedList<Course>();
            for (Course c2: allCourses) {
                boolean belongs = false;
                for (Course c: coursesTaken) {
                    if (c.equals(c2)) {
                        belongs = true;
                    }
                }
                if (!belongs) {
                    coursesNotTaken.add(c2);
                }
            }
            System.out.println("Extracted" + coursesNotTaken);
            return coursesNotTaken;
        } catch (SQLException e) {
            System.out.println("Course error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return coursesNotTaken;
    }

}
