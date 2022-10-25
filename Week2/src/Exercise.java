class Student {
    String name;
    String department; // 所属学科
    String phone;
    String address;
    int credits;

    boolean canGraduate() {
        int minCredit = 130;
        return credits >= minCredit;
    }

    boolean eliminated() {
        int maxCredit = 20;
        return credits < maxCredit;
    }
};

public class Exercise {
    public static void main(String args[]) {
        Student a = new Student();
        a.credits = 25;
        System.out.println("Can A graduate?" + a.canGraduate());
        System.out.println("Is A eliminated?" + a.eliminated());

        Student b = new Student();
        b.credits = 15;
        System.out.println("Is B eliminated?" + b.eliminated());

    }

}
