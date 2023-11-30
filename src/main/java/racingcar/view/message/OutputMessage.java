package racingcar.view.message;

public enum OutputMessage {
    RESULT("\n실행 결과"),
    START_LINE(" : "),
    TRACK("-"),
    WINNER("최종 우승자 : "),
    SEPERATOR(", ");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
