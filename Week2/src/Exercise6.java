class BankAccount {
    // 名義：name (文字列)
    // 残高：balance (整数)
    String name;
    int balance;

    // コンストラクタで名義を決定
    BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    // 預入：deposit(金額) 金額は整数
    // 引き出し：withdraw(金額) 金額は整数
    void deposit(int addBalance) {
        this.balance += addBalance;
    }

    void withdraw(int _withdraw) {
        this.balance -= _withdraw;
    }
}

// 以下変更不要
public class Exercise6 {
    public static void main(String args[]) {
        BankAccount bankAccount = new BankAccount("Taro");
        System.out.println(bankAccount.balance);
        bankAccount.deposit(1000); // 1000円預ける
        System.out.println(bankAccount.balance);
        bankAccount.withdraw(600); // 600円引き出す
        System.out.println(bankAccount.balance);
    }
}
