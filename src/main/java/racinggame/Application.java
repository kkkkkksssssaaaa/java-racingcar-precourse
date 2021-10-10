package racinggame;

import racinggame.controller.CarController;
import racinggame.model.car.Cars;

import java.awt.print.Printable;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력해주세요."
                + "(이름은 쉼표(,) 기준으로 구분)");

        CarController controller = new CarController();

        Cars cars = controller.initializeCars();
    }
}
