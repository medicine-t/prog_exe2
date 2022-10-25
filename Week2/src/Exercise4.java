class Vector {
    // フィールドを追加（x,y）
    double x, y;

    // calcLengthメソッドを追加
    // xの平方根は，Math.sqrt(x)で求めることができる
    double calcLength() {
        return Math.sqrt(x * x + y * y);
    }
}

// 以下変更不要
public class Exercise4 {
    public static void main(String args[]) {
        Vector vector = new Vector();
        vector.x = 3;
        vector.y = 4;
        System.out.println(vector.calcLength());
    }
}
