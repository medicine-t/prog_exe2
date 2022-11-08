import java.util.Random;

public class Bank {
    String bankName;
    Account[] accounts;

    Bank() {
        this.bankName = "Bank of Ryukyus";
        this.accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account();
        }
    }

    int sumOfAssets() {
        int sum = 0;
        for (Account account : accounts) {
            sum += account.balance;
        }
        return sum;
    }

    public static void main(String[] args) {
        Bank myBank = new Bank();
        System.out.println(myBank.sumOfAssets());
    }
}

class Account {
    String name;
    int balance;

    Account() {
        this.name = "hoge";
        Random rnd = new Random();
        this.balance = rnd.nextInt(100);
    }

    void deposit(int price) {
        this.balance += price;
    }

    void withDraw(int price) {
        this.balance -= price;
    }
}