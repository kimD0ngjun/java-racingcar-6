package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;

public class CarPosition extends Car{
    private final int FORWARD = 1;

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

    private int comparePosition(CarPosition other) {
        return this.position - other.position;
    }
}
