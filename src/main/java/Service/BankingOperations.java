package Service;
import Model.*;

public interface BankingOperations {

    public void deposit(BankingDetails bd , TranscationDetails td , int amount);

    public void withdraw(BankingDetails bd , TranscationDetails td , int amount);


}
