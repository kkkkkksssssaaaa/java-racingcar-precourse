package racinggame.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.model.game.ConsoleInput;

import static org.junit.jupiter.api.Assertions.*;

class RoundControllerTest extends RoundController {

    @Nested
    @DisplayName("Failed 테스트")
    class FailedTest {

        @Test
        void 숫자가_아닌_문자를_입력하면_NumberFormatException을_던진다() {
            ConsoleInput consoleInput = new ConsoleInput("one");

            assertThrows(NumberFormatException.class, () -> checkValid(consoleInput));
        }

        @Test
        void 비어있는_문자를_입력하면_NumberFormatException을_던진다() {
            ConsoleInput consoleInput = new ConsoleInput("");

            assertThrows(NumberFormatException.class, () -> checkValid(consoleInput));
        }

    }

    @Nested
    @DisplayName("Success 테스트")
    class SuccessTest {

        @ParameterizedTest
        @ValueSource(strings = { "1", "123", "4", "555", "-1" })
        void 숫자로_이루어진_문자열을_입력하여_유효성_검사를_통과할_수_있다(String string) {
            ConsoleInput consoleInput = new ConsoleInput(string);

            assertDoesNotThrow(() -> checkValid(consoleInput));
        }

    }

}