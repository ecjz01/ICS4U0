package Evaluation;

/**
 * Enfei Zhang
 * Ms. Krasteva
 * February 12, 2018
 * This is a program that contains the default constructor and methods for Bank_Account objects
 *
 * Variable Dictionary
 * Name             Type       Purpose
 * acct_num         long       The account number of the car
 * balance          double     The balance of the bank account
 * type             String     The type of bank account it is
 * interest_rate    float      The interest rate of the bank account
 */
public class Bank_Account {
    public long acct_num;
    private double balance;
    private String type;
    private float interest_rate;

    /**
     * This is the default constructor of Bank_Account objects
     * @param acct  The account number of the bank account
     * @param bal   The balance of the bank account
     * @param ty    The tpe of bank account
     * @param interest  The interest rate of the bank account
     */
    public Bank_Account (long acct, double bal, String ty, float interest){
        acct_num = acct;
        balance = bal;
        type = ty;
        interest_rate = interest;
    }

    /**
     * Returns the bank accounts balance
     * @return  Returns the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the bank accounts type
     * @return  Returns the type
     */
    public String getType(){
        return type;
    }

    /**
     * Adds money to the bank account
     * @param amt   The amount of money being deposited
     */
    public void deposit (double amt){
        balance = balance + amt;
    }

    /**
     * Takes money from the bank account
     * @param amt   The amount of money b being taken
     * @return  The transaction being completed successfully or not
     *
     * If statement checks if there is enough money to be able to withdraw
     */
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

    /**
     * This method applies interest to the bank account and updates the balance
     */
    public void applyInterest (){
        balance *= interest_rate;
    }
}
