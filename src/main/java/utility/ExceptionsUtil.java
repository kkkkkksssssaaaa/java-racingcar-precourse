package utility;

public class ExceptionsUtil {

    public static void findByNameExceptionHandler(String name) {
        AppView.printFindByNameError(name);
        Throws.throwIllegalArgumentException();
    }

}
