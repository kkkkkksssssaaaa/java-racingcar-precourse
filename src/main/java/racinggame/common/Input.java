package racinggame.common;

import nextstep.utils.Console;

public class Input {

    private final String input;

    private Input() {
        this.input = Console.readLine();
    }

    public static Input fromConsole() {
        return new Input();
    }

    public String[] splitToString(String regex) {
        return this.input.split(regex);
    }

}
