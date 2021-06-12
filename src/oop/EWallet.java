package oop;
/**
 * @author Youssef
 * @version 0.1
 * EWallet class is used to pay the price of Booking
 */
public class EWallet {
    /**
     * The balance of user
     */
    private float balance = 0;
    /**
     * the password of the user's EWallet
     */
    private String password;
    /**
     * The Id of the user
     */
    private String id;

    /**
     * To login into the EWallet
     * @param id User's Id
     * @param password User's password
     */
    public EWallet(String id, String password) {
        this.id = id;
        this.password = password;
    }

    /**
     * To set user's Id
     * @param id Id
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * To return user's Id
     * @return Id
     */
    public String getId(){
        return this.id;
    }

    /**
     * To set the balance of the EWallet
     * @param balance balance of EWallet
     */
    public void setBalance(float balance){
        this.balance = balance;
    }

    /**
     * To get the password of EWallet
     * @return EWallet's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * To set Password
     * @param Password EWallet's password
     */
    public void setPassword(String Password) {
        this.password = Password;
    }

    /**
     * To get balance
     * @return EWallet's Balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * To put money into the balance
     * @param balance balance after withdraw money
     */
    public void withdraw(float balance){
        this.balance += balance;
    }

    /**
     * To take money
     * @param balance The new balance after deposit
     */
    public void deposit(float balance){
        this.balance -= balance;
    }

    /**
     * To check the balance
     * @param id User's Id
     * @param password User's Password
     * @return id and Password
     */
    public boolean check(String id,String password){
        return this.id == id && this.password.equals(password);
    }

    /**
     * To transfer money
     * @param wallet the EWallet's Data
     * @param balance The Balance to transfer
     * @return true to confirm
     */
    public boolean transfer(EWallet wallet, float balance){
        if (this.balance-balance >= 0){
            this.balance -= balance;
            wallet.balance += balance;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "ID: " + id + '\n' + "Balance: " + balance + '\n' ;
    }
}