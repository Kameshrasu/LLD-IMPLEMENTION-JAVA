package Model;

public class TranscationDetails {
    private int amount;
    private String transcation;

    public TranscationDetails(int amount , String transcation){
        this.transcation = transcation;
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public String getTranscation(){
        return transcation;
    }
}
