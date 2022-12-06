import java.util.ArrayList;

public class GameMaster {
    ArrayList<Character> order = new ArrayList<>();

    GameMaster() {
        var denchu = new Player("デンチウ", 100, 20, 20);
        denchu.addAction(new Attack());

        // インスタンスのパラメータを変えることで攻撃魔法のバリエーションを作る
        denchu.addAction(new AttackMagic("ジューデン", 30, 10));
        denchu.addAction(new AttackMagic("ギガジューデン", 60, 20));
        denchu.addAction(new HeelingMagic("回復魔法", 10, 10));

        var dan = new Enemy("ダンさん", 40, 10, 10);
        dan.addAction(new Attack());
        dan.addAction(new AttackMagic("ダンの怒り", 30, 10));
        dan.addAction(new AttackMagic("ダンの雷", 60, 20));

        // アクションの順序を決める
        order.add(denchu);
        order.add(dan);
    }

    void showStatus() { // 全キャラクタのステータスを表示（テスト用）
        for (var ch : order) {
            ch.showStatus();
        }
    }

    void battle() { // １ターン実行する
        for (var ch : order) {
            ch.act(order);
        }
    }
}
