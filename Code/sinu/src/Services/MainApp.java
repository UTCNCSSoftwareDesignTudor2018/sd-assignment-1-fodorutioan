package Services;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Ioan on 3/27/2018.
 */
public class MainApp {


        public static void main(String[] args) {
            PreparedStatement statement = null;
            ResultSet rs = null;
            Connection connection = null;
            String query = "SELECT * FROM students";
            try {
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(query);
                //statement.setInt(1, id);
                System.out.println(statement + "\n");
                rs = statement.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("name");
                    int student_ID = rs.getInt("student_id");
                    String address = rs.getString("address");
                    System.out.println(name + "\t" + student_ID + "\t" + address);
                }
            } catch (SQLException e) {
                System.out.println("Exception!");
            } finally {
                ConnectionFactory.close(rs);
                ConnectionFactory.close(statement);
                ConnectionFactory.close(connection);
            }

//            String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11229053";
//            String user = "sql11229053";
//            String password = "cTeT6J4ytD";
//
//            String query = "SELECT VERSION()";
//
//            try (Connection con = DriverManager.getConnection(url, user, password);
//                 Statement st = con.createStatement();
//                 ResultSet rs = st.executeQuery(query)) {
//
//                if (rs.next()) {
//
//                    System.out.println(rs.getString(1));
//                }
//
//            } catch (SQLException ex) {
//
//                Logger lgr = Logger.getLogger(MainApp.class.getName());
//                lgr.log(Level.SEVERE, ex.getMessage(), ex);
//            }
        }

}
