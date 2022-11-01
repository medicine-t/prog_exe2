public class BankAccount { // publicです
    public int number;
    public int balance;

    BankAccount() {
        System.out.println("BankAccount Constructor");
    }

    BankAccount(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    BankAccount(int balance) {
        this.balance = balance;
    }

    // 入金処理
    void deposit(int amount) {
        this.balance += amount;
    }
}