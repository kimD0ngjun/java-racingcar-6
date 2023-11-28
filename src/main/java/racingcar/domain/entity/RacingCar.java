package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar extends Car{
    private final int MOVE = 1;

    private int position = 0;

    public RacingCar(String name) {
        super(name);
        this.position = calculatePosition();
    }

    public int calculatePosition() {
        if (isMove()) {
            this.position = this.position + MOVE;
        }
        return this.position;
    } // 외부에서 얘를 계속 호출해야 됨

    private boolean isMove() {
        int move = Randoms.pickNumberInRange(0,9);
        return move >= 4;
    }
}
