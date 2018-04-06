package PersistanceLayer.DAOs;

import PersistanceLayer.Entities.Teacher;
import Utils.ConnectionFactory;
import Utils.SQLQueryBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherDAO {

    public Teacher findTeacherByUserName(String username) {
        Teacher teacher = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        String query = SQLQueryBuilder.createSelect("teachers", "user", username);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                teacher = (new Teacher(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                ));
            }
        } catch (SQLException e) {
            System.out.println("Exception!");
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return teacher;
    }
}
