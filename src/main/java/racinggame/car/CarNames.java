package racinggame.car;

import racinggame.common.Input;
import racinggame.game.Printer;

import java.util.*;

public class CarNames {

    private final Set<CarName> names;

    public final static String SPLIT_REGEX = ",";

    private CarNames() {
        List<CarName> listOfNames = initNames();

        validateNames(listOfNames);

        this.names = new LinkedHashSet<>(listOfNames);
    }

    public static CarNames fromConsole() {
        return new CarNames();
    }

    public Set<CarName> names() {
        return this.names;
    }

    private List<CarName> initNames() {
        List<CarName> names = new ArrayList<>();

        for (String name
                : Input.fromConsole().splitToString(SPLIT_REGEX)) {
            names.add(CarName.of(name));
        }

        return names;
    }

    private void validateNames(List<CarName> listOfNames) {
        Set<CarName> toSet = new HashSet<>(listOfNames);

        if (listOfNames.size() != toSet.size()) {
            Printer.duplicateOfCarName();
            throw new IllegalArgumentException();
        }
    }

}
