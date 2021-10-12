package racinggame.view;

import racinggame.controller.CarController;
import racinggame.controller.RoundController;
import racinggame.model.car.Cars;
import racinggame.model.game.Game;
import racinggame.model.round.Round;

public class GameView {

    public void gameStart() {
        Cars cars = initializeCars();
        Round round = initializeRound();

        run(cars, round);
    }

    private Cars initializeCars() {
        System.out.println("경주할 자동차 이름을 입력해주세요."
                + "(이름은 쉼표(,) 기준으로 구분)");

        CarController carController = new CarController();

        return carController.initializeCars();
    }

    private Round initializeRound() {
        System.out.println("시도할 횟수는 몇 회 인가요?");

        RoundController roundController = new RoundController();

        return roundController.initializeRound();
    }

    private void run(Cars cars, Round round) {
        System.out.println("실행 결과");

        Game game = new Game(cars, round);

        game.run();
    }

}
