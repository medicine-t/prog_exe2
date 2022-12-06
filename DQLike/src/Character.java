import java.util.ArrayList;

public abstract class Character {
    String name;
    int hp;
    int mp;
    int attack;

    ArrayList<Action> actions = new ArrayList<>();

    Character(String name, int hp, int mp, int attack) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
    }

    void addAction(Action action) {
        actions.add(action);
    }

    void showStatus() {
        System.out.printf("%s:HP %d  MP %d\n", name, hp, mp);
    }

    // 影響を与える可能性のあるオブジェクトの参照を引数として受け取る
    abstract void act(ArrayList<Character> targets); // サブクラスで定義する
}
