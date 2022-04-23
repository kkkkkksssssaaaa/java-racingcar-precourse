package racinggame.game;

import racinggame.car.Car;
import racinggame.car.CarName;
import racinggame.game.round.MoveStack;
import racinggame.game.round.Round;

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

    public void go() {
        this.moveStack.add();
    }

    public CarName name() {
        return this.car.name();
    }

    public boolean isFinish() {
        return this.moveStack.isFull();
    }

}
