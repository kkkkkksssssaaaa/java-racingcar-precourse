package racinggame.car;

import java.util.LinkedHashSet;
import java.util.Set;

public class Cars {

    private final Set<Car> cars;

    private Cars() {
        this.cars = initCar();
    }

    public static Cars init() {
        return new Cars();
    }

    public Set<Car> list() {
        return this.cars;
    }

    private Set<Car> initCar() {
        Set<Car> cars = new LinkedHashSet<>();

        for (CarName name : CarNames.fromConsole().names()) {
            cars.add(Car.of(name));
        }

        return cars;
    }

}
