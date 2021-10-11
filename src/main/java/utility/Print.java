package utility;

class Print {

    protected static void printFindByName(String name) {
        System.out.printf("[ERROR] %s 자동차를 찾을 수 없습니다.\n", name);
    }

    protected static void printIsDuplicate(String name) {
        System.out.printf("[ERROR] %s 자동차는 중복된 이름입니다.\n", name);
    }

    protected static void printRetryInput() {
        System.out.println("[ERROR] 다시 입력해주세요.");
    }

    protected static void printNotAllowToSmallerThanOne() {
        System.out.println("[ERROR] 경기 회차는 1보다 작은 수로 설정 할 수 없습니다.");
    }

    protected static void printIsInteger() {
        System.out.println("[ERROR] 숫자만 입력해주세요.");
    }

}
