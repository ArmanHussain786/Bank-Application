import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,password,Balance to create an account");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();
        //creation of account
        SBIUser user = new SBIUser(name,balance,password);
        System.out.println("The account of new SBI Account is "+ user.getAccountNo());

        //add amount
        int newBalance = user.getBalance();

        System.out.println("The new balance is "+newBalance);

        //withdraw Money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));



        System.out.println("The interest for 10 years on " + user.getBalance()+"Rs will be " + user.calculateInterest(10));


    }
}