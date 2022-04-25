package racinggame.car;

import java.util.LinkedHashSet;
import java.util.Set;

public class Cars {

    private final Set<Car> cars;

    private Cars() {
        this.cars = initCar();
    }

    public static Cars init() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
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
