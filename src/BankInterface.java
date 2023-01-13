public interface BankInterface {
    int checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount,String password);
    int calculateInterest(int years);
}
