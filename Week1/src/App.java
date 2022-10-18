public class App {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += '!';
        }
        System.out.println(str);

        System.out.println("=============");

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("=============");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("=============");

        int n = 7;
        sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("=============");

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
