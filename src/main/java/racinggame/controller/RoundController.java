package racinggame.controller;

import racinggame.model.game.ConsoleInput;
import racinggame.model.round.Round;
import utility.ExceptionsUtil;

public class RoundController {

    public Round initializeRound() {
        ConsoleInput consoleInput = new ConsoleInput();

        if (checkValid(consoleInput)) {
            Integer stringToInteger = toInteger(consoleInput);

            return new Round(stringToInteger);
        }

        return null;
    }

    protected Boolean checkValid(ConsoleInput consoleInput) {
        return isInteger(consoleInput);
    }

    private Boolean isInteger(ConsoleInput consoleInput) {
        try {
            Integer.parseInt(consoleInput.toString());

            return true;
        } catch (NumberFormatException exception) {
            ExceptionsUtil.isNotInteger();

            return false;
        }
    }

    private Integer toInteger(ConsoleInput ConsoleInput) {
        return Integer.parseInt(ConsoleInput.toString());
    }

}
