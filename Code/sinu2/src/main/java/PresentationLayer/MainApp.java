package PresentationLayer;

import PresentationLayer.Controllers.LoginController;

/**
 * Created by Ioan on 3/27/2018.
 */
public class MainApp {


        public static void main(String[] args) {


            LoginController loginController = new LoginController();


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
