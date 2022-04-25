package racinggame.game;

import racinggame.car.Car;
import racinggame.car.CarName;
import racinggame.game.round.MoveStack;
import racinggame.game.round.Round;
import racinggame.game.round.Turn;

public class RaceCar {

    private final Car car;
    private final MoveStack moveStack;

    private RaceCar(Car car, Round round) {
        this.car = car;
        this.moveStack = MoveStack.of(round);
    }

    public static RaceCar entry(Car car, Round round) {
        return new RaceCar(car, round);
    }

    public CarName name() {
        return this.car.name();
    }

    public boolean isFinish() {
        return this.moveStack.isFull();
    }

    public void go(Turn.Type type) {
        if (Turn.Type.GO.equals(type)) {
            this.moveStack.add();
        }

        printStatus();
    }

    private void printStatus() {
        // TODO refactor this
        System.out.print(
                car.name().toString() +
                        ": ");
        this.moveStack.printCount('-');
        System.out.println("");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RaceCar)) {
            return false;
        }

        return ((RaceCar) obj).car.equals(this.car);
    }

    @Override
    public int hashCode() {
        return this.car.hashCode();
    }

}
