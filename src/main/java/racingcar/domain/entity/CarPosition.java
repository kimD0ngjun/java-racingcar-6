package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;

public class CarPosition extends Car{
    private final int FORWARD = 1;
    private final int STOP = 0;
    private final int MOVE_STANDARD = 4;

    private int position = 0;

    public CarPosition(String name) {
        super(name);
        this.position += incrementPosition();
    }

    public int incrementPosition() {
        if (isMove()) {
            return FORWARD;
        }
        return STOP;
    } // 외부에서 얘를 계속 호출해야 됨

    protected boolean isMove() {
        int move = Randoms.pickNumberInRange(0,9);
        return move >= MOVE_STANDARD;
    }

    // 1등 정하기
    public int comparePosition(CarPosition other) {
        return this.position - other.position;
    }
}
