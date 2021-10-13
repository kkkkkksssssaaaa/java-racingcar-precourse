package utility;

class Print {

    protected static void printOverflowCarName(Integer max) {
        System.out.printf("[ERROR] 자동차 이름은 %d 자 이하로 지어주세요.\n", max);
    }

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
        System.out.println("[ERROR] 0 이상의 숫자만 입력해주세요.");
    }

    protected static void printOutOfBounds() {
        System.out.println("[ERROR] 선택 가능한 범위를 벗어났습니다.");
    }

}
