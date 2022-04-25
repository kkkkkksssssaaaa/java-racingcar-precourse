package racinggame.game.round;

import racinggame.common.Input;

public class Round {

    private final int round;

    private Round(int round) {
        this.round = round;
    }

    public static Round fromConsole() {
        System.out.println("시도할 회수는 몇회인가요?");
        return new Round(
                Input.fromConsole().toInteger());
    }

    public int get() {
        return this.round;
    }

}
