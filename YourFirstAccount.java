public class YourFirstAccount {
    private String owner;
    private double balance;

    public YourFirstAccount(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
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

    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

}
