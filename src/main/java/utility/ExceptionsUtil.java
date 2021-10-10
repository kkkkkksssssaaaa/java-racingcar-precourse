package utility;

public class ExceptionsUtil {

    public static void findByNameIllegalArgumentException(String name) {
        Print.printFindByName(name);
        Throws.throwIllegalArgumentException();
    }

    public static void isDuplicateIllegalArgumentException(String name) {
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

}
