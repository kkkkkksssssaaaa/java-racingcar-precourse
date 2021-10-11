package racinggame.model.car;

import utility.ExceptionsUtil;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(List<String> names) {
        cars.addAll(initializeCars(names));
    }

    public Integer size() {
        return cars.size();
    }

    public Car get(Integer index) {
        if (cars.size() < index) {
            ExceptionsUtil.outOfBounds();
        }

        return cars.get(index);
    }

    public Car findByName(String name) throws IllegalArgumentException {
        int i = 0;
        boolean isNotContainThisName = true;

        while(i < this.cars.size() && isNotContainThisName) {
            isNotContainThisName = !isThisCar(this.cars.get(i), name);

            i++;
        }

        if (isNotContainThisName) {
            ExceptionsUtil.notFoundByName(name);
        }

        return this.cars.get((i - 1));
    }

    private Boolean isThisCar(Car car, String name) {
        return car.getName().equals(name);
    }

    private List<Car> initializeCars(List<String> names) {
        List<Car> tempCars = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            Car car = new Car(names.get(i));
            tempCars.add(car);
        }

        return tempCars;
    }

}
