public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HERE");
        BankAccount a1 = new BankAccount(); // A
        System.out.println("THIS PLACE");
        BankAccount a2 = new BankAccount(); // B
        BankAccount a3 = a2; // シャローコピー

        a1.deposit(10);
        a2.deposit(20);
        a3.deposit(30);

        System.out.println("a1:" + a1.balance);
        System.out.println("a2:" + a2.balance);
        System.out.println("a3:" + a3.balance);
        /*
         * 10
         * 50
         * 50
         */
        Rectangle rect = new Rectangle(20, 30);
        System.out.println(rect.calcArea());

        Circle circle = new Circle(10);
        System.out.println(circle.calcArea());
        System.out.println(circle.calcCircumference());

        Denchu denchu = new Denchu(10, 20, 30, 40);
        System.out.println(denchu.estimateAttack());
        System.out.println(denchu.estimateDefence());

        Student stu = new Student(160, 60, 30, 20, 8);
        System.out.println(stu.estimateCombat());
        System.out.println(stu.estimateESports());
        System.out.println(stu.estimateStudy());
    }
}
