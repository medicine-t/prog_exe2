import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Gakkyu gak = new Gakkyu("tnal");
        gak.add(new Student("tak", 10, 20, 30));
        gak.add(new Student("nal2", 20, 30, 40));
        System.out.println(gak.average());

        System.out.println("=================");
        Account acc = new Account("nal");
        acc.deposit(1000);
        acc.withdraw(100);

        Branch branch = new Branch("UR");
        branch.addAccount(acc);

        Bank bank = new Bank("honten", new ArrayList<>() {
            {
                add(branch);
            }
        });
        System.out.println(bank.calcTotalBalance());

    }

}
