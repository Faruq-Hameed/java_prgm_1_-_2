public class YourFirstAccount {
    private String owner;
    private double balance;

    public YourFirstAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public static void main(String[] args) {
        System.out.println("create account");
        YourFirstAccount faruqAccount = new YourFirstAccount("faruq", 100.0);

        System.out.println("Getting current balance... ");
        faruqAccount.printBalance();

        System.out.println("depositing ...");
        faruqAccount.deposit(20.0);
        System.out.println("get final balance");
        faruqAccount.printBalance();
        System.out.println(faruqAccount);

    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

}
