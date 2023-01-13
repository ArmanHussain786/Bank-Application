import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
   private String name;
   private String accountNo;
   private int balance;
    private String password;
   private int rateofInterest;

    public SBIUser(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateofInterest=6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRateofInterest() {
        return rateofInterest;
    }

    public void setRateofInterest(int rateofInterest) {
        this.rateofInterest = rateofInterest;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "Kya Aapko apna updated balance dikh rha hai "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password))
        {
            if(amount>balance)
            {
                return "Insufficient Balance";
            }
            else {
                balance=balance-amount;
                return "Paisa hi Paisa " +balance;
            }
        }
        else {

              return "Wrong Password";
        }
    }

    @Override
    public int calculateInterest(int years) {
        return (int)(balance*rateofInterest*years)/100;
    }
}
