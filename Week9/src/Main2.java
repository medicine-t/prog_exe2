import java.util.ArrayList;

class Player {
    String name;
    ArrayList<Skill> skills;

    Player(String name) {
        this.name = name;
        skills = new ArrayList<>();
        skills.add(new Fight(name));
        skills.add(new Magic(name));
        skills.add(new Tool(name));
    }
}

abstract class Skill {
    String name;

    Skill(String name) {
        this.name = name;
    }

    abstract void invoke();
}

class Fight extends Skill {
    Fight(String name) {
        super(name);
    }

    @Override
    void invoke() {
        System.out.printf("%sは攻撃した\n", name);
    }
}

class Magic extends Skill {
    Magic(String name) {
        super(name);
    }

    @Override
    void invoke() {
        System.out.printf("%sは魔法を使った\n", name);
    }
}

class Tool extends Skill {
    Tool(String name) {
        super(name);
    }

    @Override
    void invoke() {
        System.out.printf("%sは道具を使った\n", name);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Player player = new Player("勇者");
        for (Skill s : player.skills) {
            s.invoke();
        }
    }
}
