package racinggame.game;

import racinggame.car.Cars;
import racinggame.game.round.Round;
import racinggame.game.round.Turn;

import java.util.stream.Collectors;

public class Game {

    private final RaceCars raceCars;

    private Game() {
        this.raceCars = RaceCars.of(
                Cars.init(), Round.fromConsole());
    }

    public static Game init() {
        return new Game();
    }

    public void run() {
        System.out.println("실행 결과");

        while (!raceCars.finishAny()) {
            progress();
        }

        printWinners();
    }

    private void printWinners() {
        // TODO refactor
        System.out.printf(
                "최종 우승자: %s",
                raceCars.winners()
                        .stream()
                        .map(x -> x.name().toString())
                        .collect(Collectors.joining(",")));
    }

    private void progress() {
        for (RaceCar car : raceCars.cars()) {
            car.go(Turn.progress());
        }

        System.out.println("");
    }

}
