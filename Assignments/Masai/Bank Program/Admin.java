import java.util.ArrayList;

public class Admin{
    //add the employeee section here


    private String name;
    private String password;
    private String accountNumber;
    private double totalBalance;
    private String role;

    public Admin(String name, String password, String accountNumber, double totalBalance, String role) {
        this.name = name;
        this.password = password;
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

//    Show total number of accounts in the bank.
//    Search an account
//    Show Total balance in the bank
//    Exit

    public void totalNumberAccount(Customer customer){

    }
    public void searchAccount(String accountNumber){

    }
    public void totalBalanceInBank(Customer customer){

    }


}
