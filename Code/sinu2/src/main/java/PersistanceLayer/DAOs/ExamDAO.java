package PersistanceLayer.DAOs;

import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Exam;
import Utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class ExamDAO {


    public LinkedList<Exam> selectExamsNotRegistered(Long studentID) {
        LinkedList<Exam> examsNotRegistered = null;
        LinkedList<Exam> allExams = null;
        LinkedList<Exam> registeredExams = null;
        PreparedStatement statement = null;
        PreparedStatement statement2 = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {


            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(
                    "SELECT exams.*, courses.name from exams INNER JOIN registrations ON exams.id = registrations.exam_id INNER JOIN courses ON courses.id = exams.course_id WHERE registrations.student_id =?");
            statement.setLong(1, studentID);
            System.out.println(statement);
            resultSet = statement.executeQuery();
            registeredExams = new LinkedList<Exam>();
            while (resultSet.next()) {
                Exam e = new Exam(
                        resultSet.getLong(1),
                        resultSet.getLong(2),
                        resultSet.getString(3),
                        resultSet.getDate(4));
                e.setCourseName(resultSet.getString(5));
                registeredExams.add(e);
            }

            System.out.println("Registered exams: " + registeredExams);

            statement2 = connection.prepareStatement(
                    "SELECT exams.*, courses.name from exams INNER JOIN courses ON courses.id = exams.course_id");
            System.out.println(statement2);
            resultSet = statement2.executeQuery();
            allExams = new LinkedList<Exam>();
            while (resultSet.next()) {
                Exam e = new Exam(
                        resultSet.getLong(1),
                        resultSet.getLong(2),
                        resultSet.getString(3),
                        resultSet.getDate(4));
                e.setCourseName(resultSet.getString(5));
                allExams.add(e);
            }

            System.out.println("All exams: " + allExams);
            examsNotRegistered = new LinkedList<Exam>();
            for (Exam e2: allExams) {
                boolean belongs = false;
                for (Exam e : registeredExams) {
                    if (e.equals(e2)) {
                        belongs = true;
                    }
                }
                if (!belongs) {
                    examsNotRegistered.add(e2);
                }
            }

            System.out.println("Extracted(exams not taken): " + examsNotRegistered);
            return examsNotRegistered;
        } catch (SQLException e) {
            System.out.println("Exam error Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return examsNotRegistered;
    }


}
