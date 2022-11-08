public class MagicianStatus {
    String name;
    int hp;
    int mp;
    String[] magicNames;

    MagicianStatus(String name, int hp, int mp, String[] magic_names) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.magicNames = magic_names;
    }

    void print() {
        System.out.printf("name:%s, hp:%d, mp:%d", this.name, this.hp, this.mp);
        System.out.print(" magics:");
        for (var magic : this.magicNames) {
            System.out.print(magic + ",");
        }
        System.out.print("\n");
    }

    public static void main(String args[]) {
        String[] h_magics = { "ホイミ", "ベギラマ", "イオナズン" };
        var harry = new MagicianStatus("ポッタ", 15, 40, h_magics);
        String[] r_magics = { "ベホイミ", "ザキ" };
        var ron = new MagicianStatus("ロン", 20, 20, r_magics);

        harry.print();
        ron.print();
    }
};
