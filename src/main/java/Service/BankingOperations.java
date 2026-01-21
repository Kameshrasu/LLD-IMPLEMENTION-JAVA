package Service;
import Model.*;

import java.sql.SQLException;

public interface BankingOperations {

    public void deposit(int accountno , int amount) throws SQLException;

    public void withdraw(int accountno , int amount) throws SQLException;


}
