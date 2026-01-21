package ModelDAO;

import Model.BankingDetails;
import Model.TranscationDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TranscationDetailsDAO {

    public void addtranscation(TranscationDetails td , BankingDetails bd) throws SQLException {
        int amount = td.getAmount();
        String transcation = td.getTranscation();
        int account_no = bd.getAccount_no();

        Connection conn = DBUtil.DBConnection.get_connection();
        String query = "insert into TranscationDetails VALUES(?,?,?)";
        PreparedStatement pb = conn.prepareStatement(query);
        pb.setString(1,transcation);
        pb.setInt(2 , account_no);
        pb.setInt(3 , amount);

        int rows = pb.executeUpdate();

        System.out.println("transcation details added sucessfully");

    }
}
