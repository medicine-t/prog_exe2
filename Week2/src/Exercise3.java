class PairValue {
    double x;
    double y;

    double calcSum() { // 加算メソッド
        return this.x + this.y;
    }
    // 減算メソッドを実装せよ

    double calcDifference() {
        return this.x - this.y;
    }
}

// 以下変更不要
public class Exercise3 {
    public static void main(String args[]) {
        PairValue pair_value = new PairValue();
        pair_value.x = 3;
        pair_value.y = 5;
        System.out.println(pair_value.calcSum());
        System.out.println(pair_value.calcDifference());
    }
}
