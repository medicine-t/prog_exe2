import java.util.ArrayList;

public class Branch {
    String name;
    ArrayList<Account> accounts;

    Branch(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    int calcTotalBalance() {
        int sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    void addAccount(Account new_account) {
        accounts.add(new_account);
    }
}
