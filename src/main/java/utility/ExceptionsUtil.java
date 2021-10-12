package utility;

public class ExceptionsUtil {

    public static void overflowCarName(Integer max) {
        Print.printOverflowCarName(max);
    }

    public static void notFoundByName(String name) {
        Print.printFindByName(name);
    }

    public static void isDuplicateName(String name) {
        Print.printIsDuplicate(name);
    }

    public static Boolean retryInput() {
        Print.printRetryInput();

        return false;
    }

    public static void notAllowToSmallerThanOne() {
        Print.printNotAllowToSmallerThanOne();
    }

    public static void isNotInteger() throws NumberFormatException {
        Print.printIsInteger();
        throw new NumberFormatException();
    }

    public static void outOfBounds() {
        Print.printOutOfBounds();
    }

}
