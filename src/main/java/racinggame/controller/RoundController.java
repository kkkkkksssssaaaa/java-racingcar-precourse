package racinggame.controller;

import racinggame.model.game.ConsoleInput;
import racinggame.model.round.Round;
import utility.ExceptionsUtil;

public class RoundController {

    public Round initializeRound() {
        ConsoleInput consoleInput = new ConsoleInput();

        checkValid(consoleInput);

        Integer stringToInteger = toInteger(consoleInput);

        return new Round(stringToInteger);
    }

    protected void checkValid(ConsoleInput consoleInput) {
        isInteger(consoleInput);
    }

    private void isInteger(ConsoleInput consoleInput) {
        try {
            Integer.parseInt(consoleInput.toString());
        } catch (NumberFormatException exception) {
            ExceptionsUtil.isNotInteger();
        }
    }

    private Integer toInteger(ConsoleInput ConsoleInput) {
        return Integer.parseInt(ConsoleInput.toString());
    }

}
