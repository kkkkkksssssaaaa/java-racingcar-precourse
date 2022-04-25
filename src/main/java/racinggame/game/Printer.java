package racinggame.game;

import racinggame.exception.Message;
import racinggame.game.round.MoveStack;

import java.util.stream.Collectors;

public class Printer {

    private static final char MOVE_SYMBOL = '-';
    private static final String JOIN_DELIMITER = ",";

    public static void runGame() {
        System.out.println("실행 결과");
    }

    public static void initCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void initRound() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void emptyLine() {
        System.out.println();
    }

    public static void moveStatus(RaceCar car) {
        System.out.println(
                car.name().toString()
                        + ": "
                        + moveCountByChar(car.moveStack()));
    }

    public static void winners(RaceCars winners) {
        // TODO refactor
        System.out.printf(
                "최종 우승자: %s\n",
                winners.cars()
                        .stream()
                        .map(x -> x.name().toString())
                        .collect(Collectors.joining(JOIN_DELIMITER)));
    }

    public static void invalidLengthOfCarName() {
        System.out.println(Message.ofNameLength());
    }

    public static void invalidInputOfParseInt() {
        System.out.println(Message.ofParseInt());
    }

    public static void duplicateOfCarName() {
        System.out.println(Message.ofDuplicateName());
    }

    private static String moveCountByChar(MoveStack moveStack) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < moveStack.count(); i++) {
            builder.append(Printer.MOVE_SYMBOL);
        }

        return builder.toString();
    }

}
