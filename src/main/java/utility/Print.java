package utility;

class Print {

    protected static void printFindByNameIllegalArgumentException(String name) {
        System.out.printf("[ERROR] %s 자동차를 찾을 수 없습니다.\n", name);
    }

    protected static void printIsDuplicateIllegalArgumentException(String name) {
        System.out.printf("[ERROR] %s 자동차는 중복된 이름입니다.\n", name);
    }

    protected static void printRetryInput() {
        System.out.println("[ERROR] 다시 입력해주세요.");
    }

}
