package racinggame.model.game;

import nextstep.utils.Randoms;
import racinggame.model.car.Car;
import racinggame.model.car.Cars;
import racinggame.model.round.Round;

public class Game {

    private static final Integer MIN_RANDOM_RANGE = 0;
    private static final Integer MAX_RANDOM_RANGE = 9;
    private static final Integer STANDARD_VALUE = 4;
    private static final String goToken = "-";

    private final Cars cars;
    private final Round round;

    public Game(Cars cars, Round round) {
        this.cars = cars;
        this.round = round;
    }

    public void run() {
        for (int i = 0; i < round.getRound(); i++) {
            roundEvent();
            System.out.println("\n");
        }
    }

    private void roundEvent() {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);

            goAndStop(car);
            printRoundEvent(car);
        }
    }

    private void goAndStop(Car car) {
        Boolean isGo = isGo();

        if (isGo) {
            car.upGo();
        }
    }

    private void printRoundEvent(Car car) {
        String printGo = getGoTokenForCount(car);

        System.out.printf(car.getName() + " : %s\n", printGo);
    }

    private String getGoTokenForCount(Car car) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < car.getGo(); i++) {
            output.append(goToken);
        }

        return output.toString();
    }

    private Boolean isGo() {
        Integer random = getRandom();

        return random >= STANDARD_VALUE;
    }

    private Integer getRandom() {
        return Randoms.pickNumberInRange(MIN_RANDOM_RANGE, MAX_RANDOM_RANGE);
    }

}
