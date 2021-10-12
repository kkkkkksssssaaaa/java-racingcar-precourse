package racinggame.model.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.model.car.Cars;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @Nested
    @DisplayName("모델 생성 테스트")
    class CreateTest {

        @Nested
        @DisplayName("Failed 테스트")
        class FailedTest {

            List<String> names = Arrays.asList("부우우웅붕카1", "붕붕이222", "봉봉카123",
                    "붕붕붕붕붕붕", "꼬마자동차붕붕", "car123", "car123123445", "46439837236",
                    "아몬드봉봉카", "아몬드봉봉봉카", "cooooooooool", "");

            @Test
            void 지정된_이름의_길이_범위를_벗어난_이름을_지을_수_없다() {
                Cars cars = new Cars(names);

                assertEquals(cars.size(), 0);
            }

        }

        @Nested
        @DisplayName("Success 테스트")
        class SuccessTest {

            List<String> names= Arrays.asList("붕붕이", "붕붕카", "붐붐카", "붐카",
                    "아몬드봉봉", "우", "c", "car", "car1", "car12", "b", "카");

            @Test
            void 지정된_이름_길이에_부합하는_이름으로_자동차를_생성_할_수_있다() {
                Cars cars = new Cars(names);

                assertNotEquals(cars.size(), 0);
            }

        }

    }

    @Nested
    @DisplayName("기능 테스트")
    class MethodTest {

        List<String> names= Arrays.asList("붕붕이", "붕붕카", "붐붐카", "붐카",
                "아몬드봉봉", "우", "c", "car", "car1", "car12", "b", "카");

        @Nested
        @DisplayName("Failed 테스트")
        class FailedTest {

            @ParameterizedTest
            @ValueSource(strings = {
                    "봉봉이", "봉봉카", "봄봄카", "봄카",
                    "아몬드붕붕", "오", "d", "bar", "bar1", "bar12", "a", "키"
            })
            void 목록에_없는_이름을_파라미터로_findByName을_실행하면_Null을_반환한다(String unCheckedName) {
                Cars cars = new Cars(names);

                assertNull(cars.findByName(unCheckedName));
            }

            @Test
            void 초기화된_크기에서_벗어난_인덱스를_선택_할_때_Null을_반환한다() {
                Cars cars = new Cars(names);

                Integer overSize = cars.size();

                assertNull(cars.get(overSize));
            }

            @Test
            void 음수로_된_인덱스를_선택_할_때_IndexOutOfBoundsException을_반환한다() {
                Cars cars = new Cars(names);

                Integer underSize = -1;

                assertNull(cars.get(underSize));
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
            void findByName을_실행하여_해당_자동차를_찾을_수_있다(String name) {
                Cars cars = new Cars(names);

                Assertions.assertDoesNotThrow(() -> cars.findByName(name));
                assertEquals(cars.findByName(name).getName(), name);
            }

            @Test
            void 초기화된_크기_범위_내의_객체를_인덱스로_검색할_수_있다() {
                Cars cars = new Cars(names);

                Integer index = 0;

                Car carSearchByIndex = cars.get(index);

                assertEquals(carSearchByIndex.getName(), names.get(index));
            }

            @Test
            void 인덱스_검색과_이름_검색으로_얻은_객체는_동일하다() {
                Cars cars = new Cars(names);

                Integer index = 0;

                Car carSearchByIndex = cars.get(index);
                Car carSearchByName = cars.findByName(names.get(index));

                assertEquals(carSearchByIndex.getName(), names.get(index));
                assertEquals(carSearchByIndex, carSearchByName);
            }

        }

    }

}