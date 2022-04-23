package racinggame.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    private Cars() {
        this.cars = initCar();
    }

    public static Cars init() {
        return new Cars();
    }

    private List<Car> initCar() {
        List<Car> cars = new ArrayList<>();

        for (CarName name : CarNames.fromConsole().names()) {
            cars.add(Car.of(name));
        }

        return cars;
    }

}
