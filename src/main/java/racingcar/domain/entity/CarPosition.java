package racingcar.domain.entity;

public class CarPosition extends Car{
    private final int FORWARD = 1;
    private final String TRACK = "-";

    private int position = 0;

    public CarPosition(String name) {
        super(name);
        this.position = incrementPosition();
    }

    public int incrementPosition() {
        if (super.isMove()) {
            this.position += FORWARD;
        }
        return this.position;
    } // 외부에서 얘를 계속 호출해야 됨

    // 1등 정하기
    public int comparePosition(CarPosition other) {
        return this.position - other.position;
    }

    // 트랙 그리기
    public String trackPosition() {
        StringBuilder track = new StringBuilder();

        for (int i = 0; i < this.position; i++) {
            track.append(TRACK);
        }

        return track.toString();
    }
}
