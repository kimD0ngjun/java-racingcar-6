package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final int MOVE = 1;

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
        this.position = calculatePosition();
    }

    private int calculatePosition() {
        if (isMove()) {
            this.position = this.position + MOVE;
        }
        return this.position;
    }

    private boolean isMove() {
        int move = Randoms.pickNumberInRange(0,9);
        return move >= 4;
    }
}
