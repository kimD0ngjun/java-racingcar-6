package racingcar.domain.entity;

import static racingcar.utility.CarNameValidator.isValid;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.dto.CarDTO;

public class Car {
    private final int MOVE_STANDARD = 4;

    private String name;
    private int position;

    public Car(String carName) {
        isValid(carName);
        this.name = carName;
    }

    public void updatePosition() {
        if(isMove()) {
            this.position++;
        }
    }

    private boolean isMove() {
        return Randoms.pickNumberInRange(1, 9) >= MOVE_STANDARD;
    }

    public int comparePosition (Car other) {
        return this.position - other.position;
    }

    public CarDTO toDTO() {
        return new CarDTO(name, position);
    }
}
