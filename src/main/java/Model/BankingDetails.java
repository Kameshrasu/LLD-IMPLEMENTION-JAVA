package Model;

public class BankingDetails {
    private String name;
    private int account_no;
    private int balance;

   public  BankingDetails(String name,int account_no,int amount){
        this.name = name;
        this.account_no = account_no;
        this.balance = amount;

    }

    public String getName(){
        return name;
    }

    public int getAccount_no(){
        return account_no;
    }

    public int getBalance(){
        return balance;
    }
}
