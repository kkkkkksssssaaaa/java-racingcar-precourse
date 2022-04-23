package racinggame;

import racinggame.car.Cars;
import racinggame.game.round.Round;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        Cars cars = Cars.of();

        Round round = Round.fromConsole();
    }
}
