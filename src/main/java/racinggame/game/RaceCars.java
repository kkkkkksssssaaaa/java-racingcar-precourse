package racinggame.game;

import racinggame.car.Car;
import racinggame.car.Cars;
import racinggame.game.round.Round;

import java.util.LinkedHashSet;
import java.util.Set;

public class RaceCars {

    private final Set<RaceCar> raceCars;

    private RaceCars(Cars cars, Round round) {
        this.raceCars = initRaceCars(cars, round);
    }

    public static RaceCars of(Cars cars, Round round) {
        return new RaceCars(cars, round);
    }

    public Set<RaceCar> cars() {
        return this.raceCars;
    }

    private Set<RaceCar> initRaceCars(Cars cars, Round round) {
        Set<RaceCar> raceCars = new LinkedHashSet<>();

        for (Car car : cars.list()) {
            raceCars.add(RaceCar.entry(car, round));
        }

        return raceCars;
    }

}
