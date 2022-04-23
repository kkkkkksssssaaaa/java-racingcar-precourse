package racinggame.exception;

import racinggame.car.CarName;
import racinggame.car.CarNames;

public class Message {

    public static String ofNameLength() {
        return Type.NAME_LENGTH.message();
    }

    public static String ofNamesSyntax() {
        return Type.NAMES_SYNTAX.message();
    }

    enum Type {

        NAME_LENGTH {

            @Override
            protected String message() {
                return String.format(
                        MESSAGE_PREFIX + "자동차 이름은 %d자 이상, %d자 이하로 지정해주세요.",
                        CarName.MIN_LENGTH, CarName.MAX_LENGTH);
            }

        },
        NAMES_SYNTAX {

            @Override
            protected String message() {
                return String.format(
                        MESSAGE_PREFIX + "자동차 이름은 %s로 구분해주세요.",
                        CarNames.SPLIT_REGEX);
            }

        };

        private static final String MESSAGE_PREFIX = "[ERROR] ";

        abstract String message();

    }

}
