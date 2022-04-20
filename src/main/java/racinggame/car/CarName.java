package racinggame.car;

public class CarName {

    private final String name;
    private final static int MIN_LENGTH = 1;
    private final static int MAX_LENGTH = 5;

    private CarName(String name) {
        validate(name);

        this.name = name;
    }

    public static CarName of(String name) {
        return new CarName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CarName)) {
            return false;
        }

        return ((CarName) o).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    // TODO add exception text
    private void validate(String name) {
        if (name.length() < MIN_LENGTH) {
            throw new IllegalArgumentException();
        }

        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

}
