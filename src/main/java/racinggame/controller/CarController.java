package racinggame.controller;

import racinggame.model.car.Cars;
import racinggame.model.game.ConsoleInput;
import utility.ExceptionsUtil;

import java.util.ArrayList;
import java.util.List;

public class CarController {

    public Cars initializeCars() {

        ConsoleInput consoleInput = new ConsoleInput();

        if (isValid(consoleInput)) {
            List<ConsoleInput> names = consoleInput.toList(",");

            return new Cars(names);
        }

        return null;
    }

    protected Boolean isValid(ConsoleInput consoleInput) {
        return isNotEmpty(consoleInput) && isValidSyntax(consoleInput) && isNotDuplicate(consoleInput);
    }

    private Boolean isNotEmpty(ConsoleInput consoleInput) {
        if (consoleInput.isEmpty()) {
            return ExceptionsUtil.retryInput();
        }

        return true;
    }

    private Boolean isValidSyntax(ConsoleInput consoleInput) {
        if (consoleInput.contains(",,")) {
            return ExceptionsUtil.retryInput();
        }

        if (consoleInput.charAt(0) == ',') {
            return ExceptionsUtil.retryInput();
        }

        if (consoleInput.charAt(consoleInput.length() - 1) == ',') {
            return ExceptionsUtil.retryInput();
        }

        return true;
    }

    private Boolean isNotDuplicate(ConsoleInput consoleInput) {
        List<String> tempList = new ArrayList<>();
        Integer inputSize = consoleInput.split(",").length;

        for (String splitName : consoleInput.split(",")) {
            checkNotDuplicate(tempList, splitName);
        }

        return inputSize.equals(tempList.size());
    }

    private void checkNotDuplicate(List<String> tempList, String splitName) {
        if (tempList.contains(splitName)) {
            ExceptionsUtil.isDuplicateName(splitName);
        }

        if (!tempList.contains(splitName)) {
            tempList.add(splitName);
        }
    }

}
