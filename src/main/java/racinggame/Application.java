package racinggame;

import racinggame.controller.CarController;
import racinggame.model.game.Game;
import racinggame.controller.RoundController;
import racinggame.model.car.Cars;
import racinggame.model.round.Round;

public class Application {
    public static void main(String[] args) {
        System.out.println("[TEST] 경주할 자동차 이름을 입력해주세요."
                + "(이름은 쉼표(,) 기준으로 구분)");

        CarController carController = new CarController();

        Cars cars = carController.initializeCars();

        System.out.println("[TEST] 시도할 횟수는 몇 회 인가요?");

        RoundController roundController = new RoundController();

        Round round = roundController.initializeRound();

        System.out.println("[TEST] 실행 결과");

        Game game = new Game(cars, round);

        game.run();
    }
}
