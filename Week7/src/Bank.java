import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches;

    Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    int calcTotalBalance() {
        int sum = 0;
        for (Branch branch : branches) {
            sum += branch.calcTotalBalance();
        }

        return sum;
    }
}
