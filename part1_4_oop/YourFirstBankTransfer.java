package part1_4_oop;
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // System.out.println("create account");
        YourFirstAccount matthewAccount = new YourFirstAccount("Matthews account", 1000.0);
        YourFirstAccount myAccount = new YourFirstAccount("My account", 0.0);

        // Withdraws 100.0 from Matthew's account
        matthewAccount.withdraw(100.0);

        // Deposits 100.0 to "my account"
        myAccount.deposit(100.0);

        // Prints both accounts
        matthewAccount.printBalance();
        myAccount.printBalance();

    }
}