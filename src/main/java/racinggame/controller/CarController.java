package racinggame.controller;

import nextstep.utils.Console;
import racinggame.model.car.Cars;
import utility.ExceptionsUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarController {

    public Cars initializeCars() {
        // TODO Console Input 래핑 모델 생성
        String input = Console.readLine();

        if (isValid(input)) {
            List<String> names = toList(input);

            return new Cars(names);
        }

        return null;
    }

    protected Boolean isValid(String input) {
        return isNotEmpty(input) && isValidSyntax(input) && isNotDuplicate(input);
    }

    private List<String> toList(String consoleInput) {
        return new ArrayList<>(Arrays.asList(consoleInput.split(",")));
    }

    private Boolean isNotEmpty(String consoleInput) {
        if (consoleInput.isEmpty()) {
            return ExceptionsUtil.retryInput();
        }

        if (consoleInput.length() == 0) {
            return ExceptionsUtil.retryInput();
        }

        return true;
    }

    private Boolean isValidSyntax(String consoleInput) {
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

    private Boolean isNotDuplicate(String consoleInput) {
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
