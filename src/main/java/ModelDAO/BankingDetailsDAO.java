package ModelDAO;
import Model.*;
import DBUtil.*;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.*;

public class BankingDetailsDAO {

public void adduserDetail(BankingDetails BD) throws SQLException{

    String name = BD.getName();
    int accountno = BD.getAccount_no();
    int balance = BD.getBalance();

    Connection conn = DBUtil.DBConnection.get_connection();
     String query = "INSERT INTO BankingDetails VALUES(?,?,?)";
     PreparedStatement pb = conn.prepareStatement(query);
     pb.setString(1,name);
     pb.setInt(2 , accountno);
     pb.setInt(3,balance);
     int rows = pb.executeUpdate();

     System.out.println("user details added sucessfully");

}

public int getbalance(int account_no) throws SQLException{
    Connection conn = DBUtil.DBConnection.get_connection();
    String query = "SELECT balance FROM BankingDetails WHERE account_no =(?)";
    PreparedStatement pb = conn.prepareStatement(query);
    pb.setInt(1,account_no);
    ResultSet data = pb.executeQuery();
    data.next();
    return data.getInt("balance");

}

public void updatebalance(int account_no , int amount) throws SQLException{
    Connection conn = DBUtil.DBConnection.get_connection();
    int newbalance = getbalance(account_no) + amount;
    String query = "update BankingDetails set balance = (?) where account_no = (?) ";
    PreparedStatement pb = conn.prepareStatement(query);
    pb.setInt(2,account_no);
    pb.setInt(1 , newbalance);
    int rows = pb.executeUpdate();

    System.out.println(" balance updated sucessfully");

}


//    public static void main(String[] args) throws SQLException {
//        BankingDetailsDAO CHECK = new BankingDetailsDAO();
//       int data =  CHECK.getbalance(1);
//        System.out.println(data);
//
//    }

}
