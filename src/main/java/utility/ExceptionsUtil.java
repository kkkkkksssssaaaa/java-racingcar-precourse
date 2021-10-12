package utility;

public class ExceptionsUtil {

    public static void overflowCarName(Integer max) {
        Print.printOverflowCarName(max);
    }

    public static void notFoundByName(String name) {
        Print.printFindByName(name);
        Throws.throwIllegalArgumentException();
    }

    public static void isDuplicateName(String name) {
        Print.printIsDuplicate(name);
        Throws.throwIllegalArgumentException();
    }

    public static void retryInput() {
        Print.printRetryInput();
        Throws.throwIllegalArgumentException();
    }

    public static void notAllowToSmallerThanOne() {
        Print.printNotAllowToSmallerThanOne();
        Throws.throwIllegalArgumentException();
    }

    public static void isNotInteger() {
        Print.printIsInteger();
        Throws.throwNumberFormatException();
    }

    public static void outOfBounds() {
        Print.printOutOfBounds();
        Throws.throwOutOfBoundsException();
    }

}
