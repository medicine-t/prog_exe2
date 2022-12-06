import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Character {
    Enemy(String name, int hp, int mp, int attack) {
        super(name, hp, mp, attack);
    }

    @Override
    void act(ArrayList<Character> targets) {
        // テスト用コード
        // actions.get(0)はたたかうのはず．．．
        // targets.get(0)はプレーヤのはず．．．
        var rand = new Random();
        int index = rand.nextInt(actions.size()); // ランダムに選択されたインデクス
        var selected_action = actions.get(index);
        System.err.println(index);
        selected_action.execute(this, targets.get(0));
    }
}
