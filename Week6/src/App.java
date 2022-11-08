public class App {
    public static void main(String[] args) {
        // 配列のインスタンスを生成.大きさ（収納可能な要素の数）は3とする
        // 配列の基本構文：
        // 配列の要素の型[] 変数名 = new 配列の要素の型[要素の数];

        // int[] ar = new int[3];
        var ar = new int[3];
        // varはjava10で導入されたキーワードです．

        // 配列インスタンスに対しては，[]を用いて要素にアクセスできる.要素番号(index)は0から始まる
        // 要素数3の配列の，indexは，0,1,2のいずれかである
        ar[0] = 0;
        ar[1] = 10;
        ar[2] = 20;

        int[] arr = { 0, 10, 20, 30 };

        // 配列インスタンス.lengthで配列の長さ（要素数）を取得できる
        // arの各要素をプリント
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        printArray(arr);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        Student[] students = new Student[3];

        students[0] = new Student("taro", 160, 60);
        students[1] = new Student("jiro", 170, 160);
        students[2] = new Student("saburo", 180, 50);

        for (Student s : students) {
            s.print();
        }

        System.out.println("=================");
        Gakyu gakyu = new Gakyu(10);
        System.out.println(gakyu.calcAverageHeight());
    }

    static void printArray(int[] arr) {
        for (var e : arr)
            System.out.println(e);
    }
}

class Student {
    String name;
    int height;
    int weight;

    Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    void print() {
        System.out.printf("name:%s height:%d, weight:%d\n", name, height, weight);
    }
}

class Gakyu {
    Student[] students; // 配列のフィールド

    // num_student:生徒の数
    Gakyu(int num_student) {
        students = new Student[num_student]; // Studentの配列のインスタンス

        for (int i = 0; i < num_student; i++) {

            students[i] = new Student(Integer.valueOf(i).toString(), 10 + 3 * i, 10 + i);
        }
    }

    /*
     * この辺にメソッド作る
     * int 平均身長を求めるメソッドの名前() {
     * コード書いてね
     * }
     */
    int calcAverageHeight() {
        int sum = 0;
        for (var e : this.students) {
            sum += e.height;
        }
        return sum / students.length;
    }
}
