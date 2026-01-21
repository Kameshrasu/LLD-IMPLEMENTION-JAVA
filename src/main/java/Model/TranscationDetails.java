package Model;

public class TranscationDetails {

    private int transactionId;
    private int accountNo;
    private String transactionType;
    private int amount;

    public TranscationDetails(int accountNo, String transactionType, int amount) {
        this.accountNo = accountNo;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public int getAccountNo() { return accountNo; }
    public String getTransactionType() { return transactionType; }
    public int getAmount() { return amount; }
}
