package racinggame.game.round;

public class MoveStack {

    private final Round round;
    private int move = 0;

    private MoveStack(Round round) {
        this.round = round;
    }

    public static MoveStack of(Round round) {
        return new MoveStack(round);
    }

    public void add() {
        this.move++;
    }

    public boolean isFull() {
        return this.move == round.get();
    }

}
