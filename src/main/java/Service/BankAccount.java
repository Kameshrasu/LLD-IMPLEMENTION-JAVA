package Service;
import Model.BankingDetails;
import Model.TranscationDetails;
import ModelDAO.*;

import java.sql.SQLException;
import java.util.*;
public class BankAccount  {
    private BankingDetailsDAO bd;
    private TranscationDetailsDAO td;

    public BankAccount(BankingDetailsDAO bd , TranscationDetailsDAO td){
        this.bd = bd;
        this.td = td;
    }



    public void deposit(int accountno , int amount) throws SQLException {
               bd.updatebalance(accountno,amount);
    }

    public void withdraw(int accountno , int amount) throws SQLException{
        bd.withdraw(accountno ,amount);
    }
}
