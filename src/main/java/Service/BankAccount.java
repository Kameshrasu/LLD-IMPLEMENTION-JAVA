package Service;
import Model.BankingDetails;
import Model.TranscationDetails;
import ModelDAO.*;

import java.sql.SQLException;
import java.util.*;
public class BankAccount  implements BankingOperations {
    private BankingDetailsDAO bd;
    private TranscationDetailsDAO td;

    public BankAccount(BankingDetailsDAO bd , TranscationDetailsDAO td){
        this.bd = bd;
        this.td = td;
    }


    public void deposit(int accountno , int amount) throws SQLException {
        int originalbalance = bd.getbalance(accountno);
        bd.updatebalance(accountno,amount+originalbalance);
    }

    public void withdraw(int accountno , int amount) throws SQLException{

        int originalbalance = bd.getbalance(accountno);

        if(originalbalance >=amount){
            bd.updatebalance(accountno , originalbalance-amount);
        }
        else{
            System.out.println("not have an enough amount");
        }
    }
}
