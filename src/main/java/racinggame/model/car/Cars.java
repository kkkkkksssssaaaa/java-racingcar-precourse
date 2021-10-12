package racinggame.model.car;

import utility.ExceptionsUtil;

import java.util.*;

public class Cars {

    private List<Car> cars = new ArrayList<>();

    public Cars(List<String> names) {
        cars.addAll(initializeCars(names));
    }

    public Integer size() {
        return cars.size();
    }

    public Car get(Integer index) {
        if (cars.size() <= index || index < 0) {
            ExceptionsUtil.outOfBounds();

            return null;
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

            return null;
        }

        return this.cars.get((i - 1));
    }

    public List<Map.Entry<String, Integer>> toSortedEntryList() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < this.size(); i++) {
            Car car = this.get(i);

            map.put(car.getName(), car.getGo());
        }

        List<Map.Entry<String, Integer>> output = new LinkedList<>(map.entrySet());

        output.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        return output;
    }

    private Boolean isThisCar(Car car, String name) {
        return car.getName().equals(name);
    }

    private List<Car> initializeCars(List<String> names) {
        List<Car> tempCars = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            Car car = new Car(names.get(i));
            ifValidAddListAndReturn(tempCars, car);
        }

        return tempCars;
    }

    private List<Car> ifValidAddListAndReturn(List<Car> tempCars, Car car) {
        if (car.getName() != null) {
            tempCars.add(car);
        }

        return tempCars;
    }

}
