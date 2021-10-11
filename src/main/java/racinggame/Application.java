package racinggame;

import racinggame.controller.CarController;
import racinggame.controller.RoundController;
import racinggame.model.car.Cars;
import racinggame.model.round.Round;

import java.awt.print.Printable;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력해주세요."
                + "(이름은 쉼표(,) 기준으로 구분)");

        CarController carController = new CarController();

        Cars cars = carController.initializeCars();

        System.out.println("시도할 횟수는 몇 회 인가요?");

        RoundController roundController = new RoundController();

        Round round = roundController.initializeRound();
    }
}
