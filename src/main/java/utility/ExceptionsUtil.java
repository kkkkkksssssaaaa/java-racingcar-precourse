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

    public static void retryInput() {
        Print.printRetryInput();
    }

    public static void notAllowToSmallerThanOne() {
        Print.printNotAllowToSmallerThanOne();
    }

    public static void isNotInteger() {
        Print.printIsInteger();
    }

    public static void outOfBounds() {
        Print.printOutOfBounds();
    }

}
