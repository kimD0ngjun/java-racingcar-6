package racingcar.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.utility.CarNameValidator;

public class Car {
    private final int MOVE_STANDARD = 4;

    private String name;

    public Car(String name) {
        CarNameValidator.isValid(name);
        this.name = name;
    }

    boolean isMove() {
        int move = Randoms.pickNumberInRange(0,9);
        return move >= MOVE_STANDARD;
    }
}
