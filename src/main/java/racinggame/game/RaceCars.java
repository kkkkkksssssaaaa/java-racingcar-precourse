package racinggame.game;

import racinggame.car.Car;
import racinggame.car.Cars;
import racinggame.game.round.Round;

import java.util.LinkedHashSet;
import java.util.Set;

public class RaceCars {

    private final Set<RaceCar> raceCars;
    private final Cars plainCars;

    private RaceCars(Round round) {
        this.plainCars = Cars.init();
        this.raceCars = initRaceCars(round);
    }

    public static RaceCars of(Round round) {
        return new RaceCars(round);
    }

    private Set<RaceCar> initRaceCars(Round round) {
        Set<RaceCar> cars = new LinkedHashSet<>();

        for (Car car : plainCars.list()) {
            cars.add(RaceCar.entry(car, round));
        }

        return cars;
    }

}
