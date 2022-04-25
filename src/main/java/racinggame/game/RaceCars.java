package racinggame.game;

import racinggame.car.Car;
import racinggame.car.CarName;
import racinggame.car.CarNames;
import racinggame.car.Cars;
import racinggame.game.round.Round;

import java.util.*;

public class RaceCars {

    private final Set<RaceCar> raceCars;

    private RaceCars(Cars cars, Round round) {
        this.raceCars = initRaceCars(cars, round);
    }

    private RaceCars(Set<RaceCar> raceCars) {
        this.raceCars = raceCars;
    }

    public static RaceCars of(Cars cars, Round round) {
        return new RaceCars(cars, round);
    }

    public Set<RaceCar> cars() {
        return this.raceCars;
    }

    public boolean finishAny() {
        List<Boolean> finishList = new ArrayList<>();

        for (RaceCar car : cars()) {
            finishList.add(car.isFinish());
        }

        return Collections.frequency(finishList, Boolean.TRUE) > 0;
    }

    public RaceCars winners() {
        Set<RaceCar> winners = new LinkedHashSet<>();

        for (RaceCar car : cars()) {
            Optional<RaceCar> raceCar = car.ifFinish();
            raceCar.ifPresent(winners::add);
        }

        return new RaceCars(winners);
    }

    public CarNames names() {
        Set<CarName> names = new LinkedHashSet<>();

        for (RaceCar car : cars()) {
            names.add(car.name());
        }

        return CarNames.of(names);
    }

    private Set<RaceCar> initRaceCars(Cars cars, Round round) {
        Set<RaceCar> raceCars = new LinkedHashSet<>();

        for (Car car : cars.list()) {
            raceCars.add(RaceCar.entry(car, round));
        }

        return raceCars;
    }

}
