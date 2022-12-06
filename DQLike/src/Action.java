public interface Action {
    String name();

    void execute(Character executer, Character target);
}

class Attack implements Action {
    @Override
    public String name() {
        return "たたかう"; // このアクションの名称（ユーザーに提示される）
    }

    @Override
    /**
     * 実際に実行されるアクションの処理．本クラスでは武器で攻撃
     * 
     * @param executer アクションを実行するキャラクタのインスタンスが入っている
     * @param target   アクションの実行対象（攻撃対象)が入っている
     */
    public void execute(Character executer, Character target) {
        target.hp -= executer.attack;// これはダメな例！！次週以降修正
        System.out.println(executer.name + "の攻撃!!");
        System.out.println(executer.name + "は" + target.name +
                "に" + executer.attack + "ポイントのダメージを与えた!");
    }
}

class AttackMagic implements Action {
    // 魔法は個別の名前を持つ
    String name;
    int attack; // 攻撃力
    int consumption; // 消費MP

    AttackMagic(String name, int attack, int consumption) {
        this.name = name;
        this.attack = attack;
        this.consumption = consumption;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void execute(Character executer, Character target) {
        System.out.println(executer.name + "は" + name + "をとなえた!!");
        target.hp -= attack; // これもよくない例です．次週修正
        executer.mp -= consumption;
        System.out.println(target.name + "に" + attack + "ポイントのダメージをあたえた!!");
    }
}

class HeelingMagic implements Action {
    String name;
    int heelingValue = 0;
    int consumption = 0;

    HeelingMagic(String name, int heelingValue, int consumption) {
        this.name = name;
        this.heelingValue = heelingValue;
        this.consumption = consumption;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void execute(Character executer, Character target) {
        System.out.println(executer.name + "は" + name + "をとなえた!!");
        target.hp += this.heelingValue; // これもよくない例です．次週修正
        executer.mp -= this.consumption;
        System.out.println(target.name + "の体力が" + this.heelingValue + "ポイント回復した!");
    }
}