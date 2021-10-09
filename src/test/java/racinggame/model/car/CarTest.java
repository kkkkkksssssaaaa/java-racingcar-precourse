package racinggame.model.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.model.car.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Nested
    @DisplayName("모델 생성 테스트")
    class CreateTest {

        @Nested
        @DisplayName("Failed 테스트")
        class FailedTest {

            @ParameterizedTest
            @ValueSource(strings = {
                    "부우우웅붕카1", "붕붕이222", "봉봉카123", "붕붕붕붕붕붕",
                    "꼬마자동차붕붕", "car123", "car123123445", "46439837236",
                    "아몬드봉봉카", "아몬드봉봉봉카", "cooooooooool", ""
            })
            void 지정된_이름의_길이_범위를_벗어난_이름을_지을_수_없다(String name) {
                assertThrows(IllegalArgumentException.class, () -> new Car(name));
            }

        }

        @Nested
        @DisplayName("Success 테스트")
        class SuccessTest {

            @ParameterizedTest
            @ValueSource(strings = {
                    "붕붕이", "붕붕카", "붐붐카", "붐카",
                    "아몬드봉봉", "우", "c", "car",
                    "car1", "car12", "b", "카"
            })
            void 지정된_이름_길이에_부합하는_이름으로_자동차를_생성_할_수_있다(String name) {
                assertDoesNotThrow(() -> new Car(name));
            }

        }

    }

    @Nested
    @DisplayName("기능 테스트")
    class MethodTest {

        @Nested
        @DisplayName("Success 테스트")
        class SuccessTest {

            @Test
            void upGo_를_호출하여_go_횟수를_늘릴_수_있다() {
                Car car = new Car("car");
                int getGo = car.getGo();

                car.upGo();

                assertNotEquals(getGo, car.getGo());
                assertEquals(car.getGo(), 1);
            }

            @ParameterizedTest
            @ValueSource(strings = {
                    "1", "123", "1000", "2000"
            })
            void 지정된_횟수만큼_upGo_를_호출하면_go_가_늘어난다(String stringCount) {
                int parseParam = Integer.parseInt(stringCount);
                Car car = new Car("car");
                int getGo = car.getGo();

                for (int i = 0; i < parseParam; i++) {
                    car.upGo();
                }

                assertNotEquals(getGo, car.getGo());
                assertEquals(car.getGo(), parseParam);
            }

        }

    }

}