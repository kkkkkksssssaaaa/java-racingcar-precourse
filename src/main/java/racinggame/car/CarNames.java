package racinggame.car;

import racinggame.common.Input;

import java.util.LinkedHashSet;
import java.util.Set;

public class CarNames {

    private final Set<CarName> names;

    private final static String SPLIT_REGEX = ",";

    private CarNames() {
        this.names = initNames();
    }

    public static CarNames fromConsole() {
        return new CarNames();
    }

    public Set<CarName> names() {
        return this.names;
    }

    private Set<CarName> initNames() {
        // TODO refactoring at view model
        System.out.println("자동차 이름을 입력해주세요.");
        Set<CarName> names = new LinkedHashSet<>();

        for (String name
                : Input.fromConsole().splitToString(SPLIT_REGEX)) {
            names.add(CarName.of(name));
        }

        return names;
    }

}
