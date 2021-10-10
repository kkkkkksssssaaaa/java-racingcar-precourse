package racinggame.model.round;

import utility.ExceptionsUtil;

public class Round {

    private final Integer round;

    public Round(Integer round) {
        checkRound(round);

        this.round = round;
    }

    public Integer getRound() {
        return this.round;
    }

    private void checkRound(Integer round) {
        if (round <= 0) {
            ExceptionsUtil.notAllowToSmallerThanOne();
        }
    }

}
