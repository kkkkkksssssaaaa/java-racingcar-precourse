package racinggame.model.round;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

    @Nested
    @DisplayName("모델 생성 테스트")
    class CreateTest {

        @Nested
        @DisplayName("Failed 테스트")
        class FailedTest {

            @Test
            void 초기화_값에_0을_사용하면_IllegalArgumentException을_던진다() {
                assertThrows(IllegalArgumentException.class, () -> new Round(0));
            }

            @Test
            void 초기화_값에_음수를_사용하면_IllegalArgumentException을_던진다() {
                assertThrows(IllegalArgumentException.class, () -> new Round(-1));
            }

        }

        @Nested
        @DisplayName("Success 테스트")
        class SuccessTest {

            @Test
            void 초기화_값에_1이상의_수를_사용하여_초기화_할_수_있다() {
                Integer roundNum = 1;

                Round round = new Round(roundNum);

                assertEquals(roundNum, round.getRound());
            }

        }

    }

}