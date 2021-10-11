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

        checkValid(input);

        List<String> names = toList(input);

        return new Cars(names);
    }

    protected void checkValid(String input) {
        isEmpty(input);
        isNotValidSyntax(input);
        isDuplicate(input);
    }

    private List<String> toList(String consoleInput) {
        return new ArrayList<>(Arrays.asList(consoleInput.split(",")));
    }

    private void isEmpty(String consoleInput) {
        if (consoleInput.isEmpty()) {
            ExceptionsUtil.retryInput();
        }

        if (consoleInput.length() == 0) {
            ExceptionsUtil.retryInput();
        }
    }

    private void isNotValidSyntax(String consoleInput) {
        if (consoleInput.contains(",,")) {
            ExceptionsUtil.retryInput();
        }

        if (consoleInput.charAt(0) == ',') {
            ExceptionsUtil.retryInput();
        }
    }

    private void isDuplicate(String consoleInput) {
        List<String> tempList = new ArrayList<>();

        for (String splitName : consoleInput.split(",")) {
            ifDuplicateThrowsException(tempList, splitName);
            tempList.add(splitName);
        }
    }

    private void ifDuplicateThrowsException(List<String> list, String splitName) {
        if (list.contains(splitName)) {
            ExceptionsUtil.isDuplicateName(splitName);
        }
    }

}
