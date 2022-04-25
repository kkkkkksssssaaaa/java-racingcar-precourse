package racinggame.game.round;

public class MoveStack {

    private int count = 0;
    private final Round round;

    private MoveStack(Round round) {
        this.round = round;
    }

    public static MoveStack of(Round round) {
        return new MoveStack(round);
    }

    public void add() {
        this.count++;
    }

    public int count() {
        return count;
    }

    public boolean isFull() {
        return this.count >= round.get();
    }

    // TODO delegate for viewer
    public void printCount(char delimiter) {
        for (int i = 0; i < this.count; i++) {
            System.out.print(delimiter);
        }
    }

}
