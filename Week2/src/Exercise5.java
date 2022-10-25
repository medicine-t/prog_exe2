class Counter {
    // 実装せよ
    int sum, count;

    Counter() {
        sum = count = 0;
    }

    void addSample(int add) {
        sum += add;
        count++;
    }

    int calcAverage() {
        return sum / count;
    }
}

// 以下変更不要
public class Exercise5 {
    public static void main(String args[]) {
        Counter counter = new Counter();
        counter.addSample(1); // サンプルを追加
        counter.addSample(5); // サンプルを追加
        counter.addSample(12);// サンプルを追加
        System.out.println("Average : " + counter.calcAverage());
        // 6が表示されればOK
    }
}
