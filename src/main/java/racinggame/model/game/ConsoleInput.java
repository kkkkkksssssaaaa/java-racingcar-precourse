package racinggame.model.game;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;

public class ConsoleInput {

    private final String input;

    public ConsoleInput() {
        this.input = Console.readLine();
    }

    public ConsoleInput(String literal) {
        this.input = literal;
    }

    @Override
    public String toString() {
        return this.input;
    }

    public Integer length() {
        return this.input.length();
    }

    public Boolean contains(String token) {
        return this.input.contains(token);
    }

    public Character charAt(Integer index) {
        return this.input.charAt(index);
    }

    public String[] split(String token) {
        return this.input.split(token);
    }

    public Boolean isEmpty() {
        if (this.input == null) {
            return true;
        }

        if (this.input.length() == 0) {
            return true;
        }

        if (this.input == "") {
            return true;
        }

        return false;
    }

    public List<ConsoleInput> toList(String token) {
        List<ConsoleInput> output = new ArrayList<>();

        for (int i = 0; i < this.split(token).length; i++) {
            output.add(new ConsoleInput(this.split(token)[i]));
        }

        return output;
    }

    public static List<ConsoleInput> toList(String... strings) {
        List<ConsoleInput> output = new ArrayList<>();

        for (String string : strings) {
            output.add(new ConsoleInput(string));
        }

        return output;
    }

}
