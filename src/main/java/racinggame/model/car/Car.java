package racinggame.model.car;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Car {

    private static final Integer MAX_LENGTH = 5;
    private static final Integer MIN_LENGTH = 1;

    private final String name;
    private Integer go = 0;

    public Car(String name) {
        checkValid(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getGo() {
        return this.go;
    }

    public void upGo() {
        this.go ++;
    }

    private void checkValid(String name) throws IllegalArgumentException {
        if (name.length() < MIN_LENGTH || name.length() > MAX_LENGTH) {
            System.out.printf("[ERROR] 자동차 이름은 %d 자 이하로 지어주세요.\n", MAX_LENGTH);
            throw new IllegalArgumentException();
        }
    }

}
