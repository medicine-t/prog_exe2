public class Account {
    String name;
    int balance;

    Account(String name) {
        this.name = name;
        this.balance = 0;
    }

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        this.balance -= amount;
    }

    int getBalance() {
        return this.balance;
    }
}
