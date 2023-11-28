package racingcar.domain.entity;

public class CarTracker extends CarPosition {
    private final String TRACK = "-";
    private String course = "";

    public CarTracker(String name) {
        super(name);
        this.course += trackPosition();
    }

    // 트랙 그리기
    public String trackPosition() {
        StringBuilder track = new StringBuilder();

        if (super.isMove()) {
            track.append(TRACK);
        }

        return this.course += track;
    }
}
