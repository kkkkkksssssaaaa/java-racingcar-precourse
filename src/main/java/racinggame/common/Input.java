package racinggame.common;

import nextstep.utils.Console;
import racinggame.game.Printer;

public class Input {

    private final String input;

    private Input() {
        this.input = Console.readLine();
    }

    public static Input fromConsole() {
        return new Input();
    }

    public int toInteger() {
        try {
            return Integer.parseInt(this.input);
        } catch (NumberFormatException e) {
            Printer.invalidInputOfParseInt();
            throw new IllegalArgumentException();
        }
    }

    public String[] splitToString(String regex) {
        return this.input.split(regex);
    }

}
