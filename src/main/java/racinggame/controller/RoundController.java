package racinggame.controller;

import nextstep.utils.Console;
import racinggame.model.round.Round;
import utility.ExceptionsUtil;

public class RoundController {

    public Round initializeRound() {
        String input = Console.readLine();

        checkValid(input);

        Integer stringToInteger = toInteger(input);

        return new Round(stringToInteger);
    }

    protected void checkValid(String input) {
        isInteger(input);
    }

    private void isInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            ExceptionsUtil.isNotInteger();
        }
    }

    private Integer toInteger(String input) {
        return Integer.parseInt(input);
    }

}
