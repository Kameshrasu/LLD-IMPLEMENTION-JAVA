package ModelDAO;

import Model.BankingDetails;
import Model.TranscationDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DBUtil.*;

public class TranscationDetailsDAO {

    public void addtranscation(TranscationDetails td) throws SQLException {
        Connection conn = DBConnection.get_connection();
        String query = "INSERT INTO TransactionDetails(account_no, transaction_type, amount) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, td.getAccountNo());
        ps.setString(2, td.getTransactionType());
        ps.setInt(3, td.getAmount());
        ps.executeUpdate();
    }

}
