package DBUtil;
import java.sql.*;

public class DBConnection {

    public static final String URL = "jdbc:mysql://localhost:3306/banking_db";
    public static final String USER = "root";
    public static final String  PASSWD = "9486975917";


    public static Connection get_connection() throws SQLException{
        return DriverManager.getConnection(URL , USER , PASSWD);
    }

}