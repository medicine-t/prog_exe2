/**
 * 末尾に要素を追加する機能をもつ配列(ジェネリクス版)
 */
public class Array<T> {
    Object[] primitiveArray; // 実際に値を保存する配列 *1
    int last; // 現在の末尾の位置を保存する
    final int MAX_SIZE = 100; // 追加可能な最大要素数

    // コンストラクタ．引数は配列の大きさ
    Array() {
        primitiveArray = new Object[MAX_SIZE];
        last = 0; // 最初は空なので末尾は0
    }

    // 末尾に要素を追加するメソッド (T型以外渡せない)
    void add(T value) {
        primitiveArray[last] = value;
        last += 1;
    }

    // 要素を取得するメソッド (T型が返されることが明示される)
    @SuppressWarnings("unchecked") // *2
    T get(int index) {
        return (T) primitiveArray[index];
    }

    // 配列の全要素をprint
    void print() {
        for (int i = 0; i < last; i++) {
            System.out.println(String.format("[%d] %s", i, get(i).toString()));
        }
    }
}