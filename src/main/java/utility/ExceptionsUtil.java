package utility;

public class ExceptionsUtil {

    public static void findByNameIllegalArgumentException(String name) {
        Print.printFindByNameIllegalArgumentException(name);
        Throws.throwIllegalArgumentException();
    }

    public static void isDuplicateIllegalArgumentException(String name) {
        Print.printIsDuplicateIllegalArgumentException(name);
        Throws.throwIllegalArgumentException();
    }

    public static void retryInput() {
        Print.printRetryInput();
        Throws.throwIllegalArgumentException();
    }

}
