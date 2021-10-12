package racinggame.model.car;

import utility.ExceptionsUtil;

public class Car {

    private String name = null;
    private Integer go = null;

    public Car(String name) {
        if (checkValid(name)) {
            this.name = name;
            this.go = 0;
        }
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

    private Boolean checkValid(String name) {
        if (name.length() < Name.getMin() || name.length() > Name.getMax()) {
            ExceptionsUtil.overflowCarName(Name.getMax());

            return false;
        }

        return true;
    }

}
