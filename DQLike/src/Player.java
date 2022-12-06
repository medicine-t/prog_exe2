import java.util.ArrayList;

public class Player extends Character {

    Player(String name, int hp, int mp, int attack) {
        super(name, hp, mp, attack);
    }

    @Override
    void act(ArrayList<Character> targets) {
        var command_selector = new CommandSelector();

        // 選択肢を用意する
        for (var action : actions) {
            command_selector.addCommand(action.name());
        }
        // ユーザの選択を待つ
        var command_number = command_selector.waitForUsersCommand("コマンド？");

        // ターゲットも同様に入力
        command_selector.clearCommands();
        for (var target : targets) {
            command_selector.addCommand(target.name);
        }
        var target_number = command_selector.waitForUsersCommand("ターゲット？");

        actions.get(command_number).execute(this, targets.get(target_number));
        // ^ユーザが選択したアクション番号 ^選択したターゲット番号
    }

}
