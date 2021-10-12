package racinggame.model.round;

import utility.ExceptionsUtil;

public class Round {

    private Integer round = null;

    public Round(Integer round) {
        if (checkRound(round)) {
            this.round = round;
        }
    }

    public Integer getRound() {
        return this.round;
    }

    private Boolean checkRound(Integer round) {
        if (round <= 0) {
            ExceptionsUtil.notAllowToSmallerThanOne();

            return false;
        }

        return true;
    }

}
