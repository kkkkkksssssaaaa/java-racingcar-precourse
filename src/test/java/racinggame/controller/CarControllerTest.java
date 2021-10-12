package racinggame.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import racinggame.model.car.Cars;

import static org.junit.jupiter.api.Assertions.*;

class CarControllerTest extends CarController {

    @Nested
    @DisplayName("Failed 테스트")
    class FailedTest {

        @Test
        void 중복된_이름을_사용하면_IllegalArgumentException을_던진다() {
            String duplicatedNames = "붕붕이,붕붕이,붕붕이,붕붕이,붕붕이";

            assertThrows(IllegalArgumentException.class, () -> checkValid(duplicatedNames));
        }

        @Test
        void 비어있는_String을_파라미터로_사용하면_IllegalArgumentException을_던진다() {
            String emptyString = "";

            assertThrows(IllegalArgumentException.class, () -> checkValid(emptyString));
        }

        @Test
        void 비어있는_이름_요소가_있다면_IllegalArgumentException을_던진다() {
            String containEmptyName = "붕붕이,,붕붕카";

            assertThrows(IllegalArgumentException.class, () -> checkValid(containEmptyName));
        }

        @Test
        void 첫_글자가_콤마로_시작되면_IllegalArgumentException을_던진다() {
            String notValidName = ",붕붕이,부릉이";

            assertThrows(IllegalArgumentException.class, () -> checkValid(notValidName));
        }

        @Test
        void 마지막_글자가_콤마로_끝나면_IllegarArgumentException을_던진다() {
            String notValidName = "붕붕이,부릉이,";

            assertThrows(IllegalArgumentException.class, () -> checkValid(notValidName));
        }

    }

    @Nested
    @DisplayName("Success 테스트")
    class SuccessTest {

        @Test
        void 콤마로_구분된_5자_이하의_String을_입력받아_유효성_검사를_통과할_수_있다() {
            String names = "붕붕이,봉봉이,붕카,부릉이";

            assertDoesNotThrow(() -> checkValid(names));
        }

    }

}