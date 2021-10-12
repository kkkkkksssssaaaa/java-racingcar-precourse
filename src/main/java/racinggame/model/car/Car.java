package racinggame.model.car;

import utility.ExceptionsUtil;

public class Car {

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
        if (name.length() < Name.getMin() || name.length() > Name.getMax()) {
            ExceptionsUtil.overflowCarName(Name.getMax());
        }
    }

}
