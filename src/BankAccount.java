public class BankAccount {
    public double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Initial balance can't be negative. Set to 0.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount>=balance){
            balance -=amount;
            System.out.println("Withdrown :" +amount);
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Withdraw amount must be positive!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // starting balance

        account.checkBalance();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // test insufficient balance
        account.checkBalance();
    }
}