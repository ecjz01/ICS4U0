package Evaluation;

public class Bank_Account {
    public long acct_num;
    private double balance;
    private String type;
    private float interest_rate;

    public Bank_Account (long acct, double bal, String ty, float interest){
        acct_num = acct;
        balance = bal;
        type = ty;
        interest_rate = interest;
    }

    public double getBalance() {
        return balance;
    }

    public String getType(){
        return type;
    }

    public void deposit (double amt){
        balance = balance + amt;
    }

    public boolean withdrawal (double amt){
        if (balance >= amt){
            balance = balance - amt;
            return true;
        }
        else{
            balance = balance + amt;
            return false;
        }
    }

    public void applyInterest (){
        balance = balance - (balance * interest_rate);
    }
}
